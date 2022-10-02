from tkinter import *
from zeep import Client
import tkinter as tk 
import pandas as pd
import ast
import matplotlib.pyplot as plt

#Crear el cliente
cliente = Client('http://192.168.0.3:8080/WebServicesElecciones/Conector?wsdl')
#________________________VENTANA_________________________  
ventana=tk.Tk()
ventana.title("Resultados Votantes")
ventana.resizable(False,False)
ventana.geometry("380x380")
ventana.configure(background='dark turquoise')


#________________________FUNCIONES-GRAFICAS_________________________  
def obtenerTotalVotosSiNo(tupla):
        siVoto = tupla[(tupla["voto"]=='1')]
        noVoto = tupla[(tupla["voto"]=='0')]
        
        
        dfVotoSiNo = pd.DataFrame({'tipoVoto': ['SiVoto','NoVoto'],
        'Total': [len(siVoto),len(noVoto)]})
        return dfVotoSiNo    


#________________________FUNCION DE GRAFICAR URNA___________     
def graficarUrna():
    candidatos = cliente.service.consultarUrnaCandidatos()
    df = pd.DataFrame([x.split('-') for x in candidatos.split('/')])
    df2 = df.iloc[:-1 , :]
    df2.columns = ['nombre', 'partido', 'totalVotos']
    print(df2)

     #GRAFICA
    plt.bar(df2['nombre'],df2['totalVotos'])
    plt.title('votosPorCandidato')
    plt.show()

    

#_____________________FUNCIONES DE GRAFICAR VOTANTES__________
def graficarVotantes():
    votantes = cliente.service.consultaVotantes()
    df = pd.DataFrame([x.split('-') for x in votantes.split('/')])
    df2 = df.iloc[:-1 , :]
    df2.columns = ['id','nombre', 'seccion', 'voto']
    print(df2)

    #PARA GRAFICAR TENGO QUE CONTAR PRIMERO CUANTOS SON  O Y 1

    #GRAFICA 

    resultado = obtenerTotalVotosSiNo(df2)
    plt.bar(resultado['tipoVoto'],resultado['Total'])
    plt.title('Cantidad de Si Votos y No Votos')
    plt.ylabel('Cantidad')
    plt.show()

def graficarVotantesSeccion():
    votantes = cliente.service.consultaVotantes()
    df = pd.DataFrame([x.split('-') for x in votantes.split('/')])
    df2 = df.iloc[:-1 , :]
    df2.columns = ['id','nombre', 'seccion', 'voto']
    print(df2)
    resDefUIC = df2.groupby(['seccion']).size()
    print(resDefUIC)

    resDefUIC.plot(kind="bar", stacked = True)
    plt.title('Votantes Por Sección')
    plt.ylabel('Cantidad')
    plt.xlabel('Sección')
    plt.show()






#________________________BOTON GRAFICAR URNA_________________________  
boton=tk.Button(ventana,text="VOTANTES_SECCION",command=graficarVotantesSeccion)
boton.pack(side=LEFT,padx=50)

#________________________BOTON GRAFICAR VOTANTES_________________________  
boton2=tk.Button(ventana,text="CANTIDAD VOTOS",command=graficarVotantes)
boton2.pack(side=RIGHT,padx=30)

ventana.mainloop()
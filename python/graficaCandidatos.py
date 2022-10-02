from tkinter import *
from zeep import Client
import pandas as pd
import matplotlib.pyplot as plt


def run():
    #Crear el cliente
    cliente = Client('http://192.168.1.68:8080/WebServicesElecciones/Conector?wsdl')
    
    candidatos = cliente.service.consultarUrnaCandidatos()
    
    df = pd.DataFrame([x.split('-') for x in candidatos.split('/')])
    df2 = df.iloc[:-1 , :]
    df2.columns = ['nombre', 'partido', 'totalVotos']
    color = ['#E0BBE4','#957DAD','#D291BC','#FEC8D8','#FFDFD3']
    

    fig,(ax1) = plt.subplots(nrows=1,ncols=1,figsize=(8,8))
    ax1.pie(df2['totalVotos'],labels=df2['nombre'],autopct="%0.1f%%",colors=color)

    ax1.set_title("Resultados de los votos")
    plt.show()


if __name__ == '__main__':
    run()

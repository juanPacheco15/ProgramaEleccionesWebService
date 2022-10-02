using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace CandidatosWSDL
{
    public partial class Form1 : Form
    {
        TextBox con = new TextBox();
        ServiceReference1.ConectorClient conexion;
        string dato;
        String dato1;
        String[] trozos1;
        public Form1()
        {
            InitializeComponent();
            conexion = new ServiceReference1.ConectorClient();
            
            
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }  
        
        public void actualizarTabla()
        {
            dato1 = "" + conexion.mostrarCandidatos();
            char[] delimitador = { ',' };
            char[] delimitador1 = { '-' };
            String[] trozos = dato1.Split(delimitador);
            int indice = trozos.Length - 1;
            for (int i = 0; i < indice; i++)
            {
                trozos1 = trozos[i].Split(delimitador1);
                mostrar.Rows.Add(trozos1[0], trozos1[1], trozos1[2], trozos1[3], trozos1[4]);
            }
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            mostrar.Columns.Add("clave","Clave");
            mostrar.Columns.Add("nombre", "Nombre");
            mostrar.Columns.Add("apellidoMaterno", "Apellido Paterno");
            mostrar.Columns.Add("apellidoMaterno", "Apellido Materno");
            mostrar.Columns.Add("partido", "Partido");

            dato1 = "" + conexion.mostrarCandidatos();
            char[] delimitador = { ',' };
            char[] delimitador1 = { '-' };
            String[] trozos = dato1.Split(delimitador);
            int indice = trozos.Length - 1;
            for (int i = 0; i < indice; i++)
            {
                trozos1 = trozos[i].Split(delimitador1);
                mostrar.Rows.Add(trozos1[0], trozos1[1], trozos1[2], trozos1[3], trozos1[4]);
            }
            

        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (txtPartido.Text == "" && txtPartido.Text == "")
            {
                MessageBox.Show("Debes ingresar un partido");
            }
            else
            {
                mostrar.Rows.Clear();
                conexion.insertarCandidato(txtClave.Text,txtPartido.Text);
                actualizarTabla();
                txtClave.Text = "";
                txtNombre.Text = "";
                txtApellido.Text = "";
                txtApallidoMaterno.Text = "";
                txtPartido.Text = "";
            }
            
            


        }
        
        private void mostrar_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            
            txtClave.Text = mostrar.CurrentRow.Cells[0].Value.ToString();
            txtNombre.Text = mostrar.CurrentRow.Cells[1].Value.ToString();
            txtApellido.Text = mostrar.CurrentRow.Cells[2].Value.ToString();
            txtApallidoMaterno.Text = mostrar.CurrentRow.Cells[3].Value.ToString();
            txtPartido.Text = mostrar.CurrentRow.Cells[4].Value.ToString();

            button1.Visible = false;

        }

        private void button2_Click(object sender, EventArgs e)
        {
            conexion.eliminarCandidato(Int32.Parse(txtClave.Text));
            mostrar.Rows.Clear();
            actualizarTabla();
            txtClave.Text = "";
            txtNombre.Text = "";
            txtApellido.Text = "";
            txtApallidoMaterno.Text = "";
            txtPartido.Text = "";

        }

        private void buscar_Click(object sender, EventArgs e)
            
        {
            string clave = txtClave.Text;
            dato = "" + conexion.candidatos(clave);
            if (dato.Length == 0)
            {
                MessageBox.Show("No hay registro del ciudadano");
            }
            else
            {
                char[] delimitador = { '-'};
                String[] trozos = dato.Split(delimitador);
                txtClave.Text = trozos[0];
                txtNombre.Text = trozos[1];
                txtApellido.Text=trozos[2];
                txtApallidoMaterno.Text = trozos[3];
            }
            txtNombre.Enabled = false;
            txtApellido.Enabled = false;
            txtApallidoMaterno.Enabled = false;

            button1.Visible = true;




        }

        private void txtClave_TextChanged(object sender, EventArgs e)
        {

        }

        private void editar_Click(object sender, EventArgs e)
        {
            conexion.modificarCandidato(Int32.Parse(txtClave.Text), txtPartido.Text);
            mostrar.Rows.Clear();
            actualizarTabla();
            txtClave.Text = "";
            txtNombre.Text = "";
            txtApellido.Text = "";
            txtApallidoMaterno.Text = "";
            txtPartido.Text = "";
        }
    }
}

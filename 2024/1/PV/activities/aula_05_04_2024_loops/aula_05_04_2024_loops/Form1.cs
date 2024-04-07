using System;
using System.Windows.Forms;

namespace aula_05_04_2024_loops
{
    public partial class Form1 : Form
    {
        private int n;

        public Form1()
        {
            InitializeComponent();
        }

        private void BtnDoWhile_Click(object sender, EventArgs e)
        {
            if (CheckFields().Equals("false"))
            {
                frmResultado f = new frmResultado("DOWHILE", n);
                f.ShowDialog();

                txtNumber.Text = "";
            }
            else
            {
                MessageBox.Show(CheckFields(), "Atenção!", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                txtNumber.Text = "";
                txtNumber.Focus();
            }
        }

        private void BtnWhile_Click(object sender, EventArgs e)
        {
            if (CheckFields().Equals("false"))
            {
                frmResultado f = new frmResultado("WHILE", n);
                f.ShowDialog();

                txtNumber.Text = "";
            }
            else
            {
                MessageBox.Show(CheckFields(), "Atenção!", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                txtNumber.Text = "";
                txtNumber.Focus();
            }
        }

        private void BtnFor_Click(object sender, EventArgs e)
        {
            if (CheckFields().Equals("false"))
            {
                frmResultado f = new frmResultado("FOR", n);
                f.ShowDialog();

                txtNumber.Text = "";
            }
            else
            {
                MessageBox.Show(CheckFields(), "Atenção!", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                txtNumber.Text = "";
                txtNumber.Focus();
            }
        }

        private void BtnTabuada_Click(object sender, EventArgs e)
        {
            FrmOptions f = new FrmOptions("TABUADA");
            f.ShowDialog();
        }

        private string CheckFields()
        {
            string message;

            if (string.IsNullOrWhiteSpace(txtNumber.Text))
            {
                message =  "Campos vazios!";
            }
            else
            {
                try
                {
                    n = int.Parse(txtNumber.Text);
                    message = "false";
                }
                catch
                {
                    message = "Erro Inesperado!\nSomente nùmeros inteiros.";
                }
            }

            return message;
        }
    }
}


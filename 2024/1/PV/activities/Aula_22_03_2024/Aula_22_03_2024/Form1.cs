using System;
using System.Drawing;
using System.Windows.Forms;

namespace Aula_22_03_2024
{
    public partial class frmMain : Form
    {

        private string placeholderText = "Digite aqui seu nome...";

        public frmMain()
        {
            InitializeComponent();
        }

        private void btnCalcular_Click(object sender, EventArgs e)
        {

            if (checkFiels())
            {
                MessageBox.Show("Por favor, preencha todos os campos.", "Campos Vazios", MessageBoxButtons.OK, MessageBoxIcon.Warning);

                return;
            }
            else
            {
                string name = txtName.Text;

                float n1 = float.Parse(txtN1.Text);
                float n2 = float.Parse(txtN2.Text);
                float n3 = float.Parse(txtN3.Text);
                float n4 = float.Parse(txtN4.Text);

                Console.WriteLine(name.Equals(""));

                frmBoletim f = new frmBoletim(name, n1, n2, n3, n4);
                f.ShowDialog();
            }
        }

        private void frmMain_Load(object sender, EventArgs e)
        {
            txtName.Text = placeholderText;
            txtName.ForeColor = Color.Gray;

            lbl1.BackColor = Color.Transparent;
            lbl2.BackColor = Color.Transparent;
            lbl2.BackColor = Color.Transparent;
            lbl3.BackColor = Color.Transparent;
            lbl4.BackColor = Color.Transparent;
            lbl5.BackColor = Color.Transparent;
            lbl6.BackColor = Color.Transparent;
            lbl7.BackColor = Color.Transparent;

            btnCalcular.BackColor = Color.Transparent;
        }

        private void txtName_Enter(object sender, EventArgs e)
        {
            // Remove o texto de exemplo quando o TextBox recebe foco
            if (txtName.Text == placeholderText)
            {
                txtName.Text = "";
                txtName.ForeColor = Color.Black; // Restaura a cor do texto padrão
            }
        }

        private void txtName_Leave(object sender, EventArgs e)
        {
            // Adiciona o texto de exemplo se o TextBox estiver vazio ao perder o foco
            if (string.IsNullOrWhiteSpace(txtName.Text))
            {
                txtName.Text = placeholderText;
                txtName.ForeColor = Color.Gray; // Define a cor do texto de exemplo
            }
        }

        private bool checkFiels()
        {
            if (string.IsNullOrEmpty(txtName.Text) || txtName.Text.Equals(placeholderText))
            {
                txtName.Focus();
                return true;
            }
            else if (string.IsNullOrEmpty(txtN1.Text))
            {
                txtN1.Focus();
                return true;
            }
            else if (string.IsNullOrEmpty(txtN2.Text))
            {
                txtN2.Focus();
                return true;
            }
            else if (string.IsNullOrEmpty(txtN3.Text))
            {
                txtN3.Focus();
                return true;
            }
            else if (string.IsNullOrEmpty(txtN4.Text))
            {
                txtN4.Focus();
                return true;
            }
            else
            {
                return false;
            }
        }

    }
}

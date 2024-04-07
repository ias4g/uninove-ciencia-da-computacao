using System;
using System.Drawing;
using System.Windows.Forms;

namespace Aula_22_03_2024
{
    public partial class frmMain : Form
    {

        private readonly string _placeholderText = "Digite aqui seu nome...";

        public frmMain()
        {
            InitializeComponent();
        }

        private void BtnCalcular_Click(object sender, EventArgs e)
        {

            if (CheckFiels().Equals("true"))
            {
                MessageBox.Show("Por favor! Verificar se algum campo está vazio!\nAs notas não podem ser negativa ou maior que 10.\nNão colocar ponto e sim virgulas.", "Atenção!", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                return;
            }
            else if (CheckFiels().Equals("false")) {
				string name = txtName.Text;

				float n1 = float.Parse(txtN1.Text);
				float n2 = float.Parse(txtN2.Text);
				float n3 = float.Parse(txtN3.Text);
				float n4 = float.Parse(txtN4.Text);

				FrmBoletim f = new FrmBoletim(name, n1, n2, n3, n4);
				f.ShowDialog();
            }
            else
            {
				MessageBox.Show(CheckFiels(), "Error!", MessageBoxButtons.OK, MessageBoxIcon.Error);
				return;
			}
        }

        private void FrmMain_Load(object sender, EventArgs e)
        {
            txtName.Text = _placeholderText;
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

        private void TxtName_Enter(object sender, EventArgs e)
        {
            // Remove o texto de exemplo quando o TextBox recebe foco
            if (txtName.Text == _placeholderText)
            {
                txtName.Text = "";
                txtName.ForeColor = Color.Black; // Restaura a cor do texto padrão
            }
        }

        private void TxtName_Leave(object sender, EventArgs e)
        {
            // Adiciona o texto de exemplo se o TextBox estiver vazio ao perder o foco
            if (string.IsNullOrWhiteSpace(txtName.Text))
            {
                txtName.Text = _placeholderText;
                txtName.ForeColor = Color.Gray; // Define a cor do texto de exemplo
            }
        }

        private string CheckFiels()
        {
            try { 
                if (string.IsNullOrEmpty(txtName.Text) || txtName.Text.Equals(_placeholderText))
                {
                    txtName.Focus();
                    return "true";
                }
                else if (string.IsNullOrEmpty(txtN1.Text) || float.Parse(txtN1.Text) > 10 || float.Parse(txtN1.Text) < 0)
                {
                    txtN1.Focus();
                    return "true";
                }
                else if (string.IsNullOrEmpty(txtN2.Text) || float.Parse(txtN2.Text) > 10 || float.Parse(txtN2.Text) < 0)
                {
                    txtN2.Focus();
                    return "true";
                }
                else if (string.IsNullOrEmpty(txtN3.Text) || float.Parse(txtN3.Text) > 10 || float.Parse(txtN3.Text) < 0)
                {
                    txtN3.Focus();
                    return "true";
                }
                else if (string.IsNullOrEmpty(txtN4.Text) || float.Parse(txtN4.Text) > 10 || float.Parse(txtN4.Text) < 0)
                {
                    txtN4.Focus();
                    return "true";
                }
                else
                {
                    return "false";
                }
			}
			catch {
				return "Erro Inesperado!\nAconteceu um erro ao verificar os campos!\nDigitar somente números positivos [1][3,5][0,45]";				
			}
		}

    }
}
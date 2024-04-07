using System;
using System.Drawing;
using System.Windows.Forms;

namespace Aula_22_03_2024
{
    public partial class FrmBoletim : Form
    {

        private readonly string name;
        private float nota1;
        private float nota2;
        private float nota3;
        private float nota4;

        private string res;

        public FrmBoletim(string name, float n1, float n2, float n3, float n4)
        {
            InitializeComponent();

            this.name = name;
            this.nota1 = n1;
            this.nota2 = n2;
            this.nota3 = n3;
            this.nota4 = n4;

            ShowDatas();
        }

        private void ShowDatas()
        {
            lblName.Text = this.name.ToUpper();
            lblCh.Text = nota1.ToString("0.0");
            lblCn.Text = nota2.ToString("0.0");
            lblMst.Text = nota3.ToString("0.0");
            lblLcst.Text = nota4.ToString("0.0");

            float soma = 0.0f;

            float[] notas = new float[4];
            notas[0] = nota1;
            notas[1] = nota2;
            notas[2] = nota3;
            notas[3] = nota4;

            float m_number = notas[0];

            foreach (var nota in notas)
            {

                if (nota < m_number)
                {
                    m_number = nota;
                }

                soma += nota;
            }

            float media = (soma - m_number) / 3;
            lblNotaDescarte.Text = m_number.ToString("0.0");

            if (media < 6)
            {
                lblResultado.ForeColor = Color.Red;
                res = "Reprovado";
                pbResultado.Load("deslike.png");
            }
            else
            {
                lblResultado.ForeColor = Color.Green;
                res = "Aprovado";
                pbResultado.Load("like.png");
            }

            lblResultado.Text = this.res;
            lblMedia.Text = media.ToString("0.0");
        }

        private void Form3_Load(object sender, EventArgs e)
        {
            this.Text = "BOLETIM " + this.res.ToUpper();

            lblBoletim.BackColor = Color.Transparent;
            lblName.BackColor = Color.Transparent;
            lblCih.BackColor = Color.Transparent;
            lblCh.BackColor = Color.Transparent;
            lblCin.BackColor = Color.Transparent;
            lblCn.BackColor = Color.Transparent;
            lblMast.BackColor = Color.Transparent;
            lblMst.BackColor = Color.Transparent;
            lblLicst.BackColor = Color.Transparent;
            lblLcst.BackColor = Color.Transparent;
            lblNd.BackColor = Color.Transparent;
            lblNotaDescarte.BackColor = Color.Transparent;
            lblSm.BackColor = Color.Transparent;
            lblMedia.BackColor = Color.Transparent;
            lblResultado.BackColor = Color.Transparent;
            pbResultado.BackColor = Color.Transparent;
        }
    }
}
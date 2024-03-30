using System;
using System.Drawing;
using System.Windows.Forms;

namespace Aula_22_03_2024
{
    public partial class frmBoletim : Form
    {

        private string _name;
        private float _nota1;
        private float _nota2;
        private float _nota3;
        private float _nota4;

        private string res;

        public frmBoletim(string name, float n1, float n2, float n3, float n4)
        {
            InitializeComponent();

            this._name = name;
            this._nota1 = n1;
            this._nota2 = n2;
            this._nota3 = n3;
            this._nota4 = n4;

            showDatas();
        }

        private void showDatas()
        {
            lblName.Text = this._name.ToUpper();
            lblCh.Text = _nota1.ToString("0.0");
            lblCn.Text = _nota2.ToString("0.0");
            lblMst.Text = _nota3.ToString("0.0");
            lblLcst.Text = _nota4.ToString("0.0");


            float media = 0.0f;

            float m_number = 0.0f;

            float soma = 0.0f;

            float[] notas = new float[4];
            notas[0] = _nota1;
            notas[1] = _nota2;
            notas[2] = _nota3;
            notas[3] = _nota4;

            m_number = notas[0];

            foreach (var nota in notas)
            {

                if (nota < m_number)
                {
                    m_number = nota;
                }

                soma += nota;
            }

            media = (soma - m_number) / 3;

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
            this.Text = "BOLETIM DE * " + this._name.ToUpper() + " * " + this.res.ToUpper();

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
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
            lblName.Text = this._name;
            lblN1.Text = _nota1.ToString();
            lblN2.Text = _nota2.ToString();
            lblN3.Text = _nota3.ToString();
            lblN4.Text = _nota4.ToString();

            
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

                if(nota < m_number)
                {
                    m_number = nota;
                }

                soma += nota;
            }
            
            media = (soma - m_number) / 3;

            lblDes.Text = "NOTA DESCARTE";
            lblMnumber.Text = m_number.ToString();

            if(media < 6)
            {
                lblStatus.ForeColor = System.Drawing.Color.Red;
                lblStatus.Text = "Reprovado";
                pbStatus.Load("deslike.png");
            }
            else
            {
                lblStatus.ForeColor = System.Drawing.Color.Green;   
                lblStatus.Text = "Aprovado";
                pbStatus.Load("like.png");
            }

            lblMedia.Text = "Sua média é: " + media.ToString();
            pbFooter.Load("footer.png");
        }
    }
}

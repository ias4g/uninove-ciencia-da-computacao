using System.Windows.Forms;

namespace AULA_12_04_2024_MATRIZ
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void BtnShow_Click(object sender, System.EventArgs e)
        {
            LbList.Items.Clear();

            string[,] nomes = new string[,] {
                { "Izael", "Proberto", "Love"},
                { "Eversson", "Gabriel", "Jonas"},
                { "Prof", "Jessica", "gabi"},
                { "Deus", "Jesus", "Victoria"}
            };

            for (int i = 0; i < nomes.GetLength(0); i++)
            {
                for (int j = 0; j < nomes.GetLength(1); j++)
                {
                    LbList.Items.Add("NA POSIÇÃO [" + i + ", " + j + "] É: " + nomes[i, j]);
                }
            }

            this.Text = "SUA MATRIZ É " + nomes.GetLength(0).ToString() + " por " + nomes.GetLength(1).ToString();
        }
    }
}
using System;
using System.Windows.Forms;

namespace aula_05_04_2024_loops
{
    public partial class FrmOptions : Form
    {
        private readonly string _name;

        public FrmOptions(string name)
        {
            InitializeComponent();

            this._name = name;
            CbOptions.SelectedIndex = 2;
        }

        private void BtnNext_Click(object sender, System.EventArgs e)
        {
            string opt = CbOptions.SelectedItem as string;

            this.Close();

            frmResultado f = new frmResultado("TABUADA", opt);
            f.ShowDialog();

        }
    }
}

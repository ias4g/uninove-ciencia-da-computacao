using System;
using System.Windows.Forms;

namespace Aula_22_03_2024
{
    public partial class frmInitial : Form
    {
        public frmInitial()
        {
            InitializeComponent();
        }

        private void btnStart_Click(object sender, EventArgs e)
        {
  
            frmMain f = new frmMain();
            f.ShowDialog();

        }
    }
}

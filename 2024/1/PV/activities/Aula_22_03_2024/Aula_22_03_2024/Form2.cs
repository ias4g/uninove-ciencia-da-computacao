using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
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

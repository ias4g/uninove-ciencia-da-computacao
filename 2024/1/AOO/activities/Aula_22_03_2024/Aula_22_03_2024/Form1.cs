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
    public partial class frmMain : Form
    {
        public frmMain()
        {
            InitializeComponent();
        }

        private void btnCalcular_Click(object sender, EventArgs e)
        {
            string name = txtName.Text;

            float n1 = float.Parse(txtNota01.Text);
            float n2 = float.Parse(txtNota02.Text);
            float n3 = float.Parse(txtNota03.Text);
            float n4 = float.Parse(txtNota04.Text);

            frmBoletim f = new frmBoletim(name, n1, n2, n3, n4);
            f.ShowDialog();
        }
    }
}

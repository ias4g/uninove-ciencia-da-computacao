namespace Aula_22_03_2024
{
    partial class frmMain
    {
        /// <summary>
        /// Variável de designer necessária.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpar os recursos que estão sendo usados.
        /// </summary>
        /// <param name="disposing">true se for necessário descartar os recursos gerenciados; caso contrário, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código gerado pelo Windows Form Designer

        /// <summary>
        /// Método necessário para suporte ao Designer - não modifique 
        /// o conteúdo deste método com o editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(frmMain));
            this.btnCalcular = new System.Windows.Forms.Button();
            this.panel1 = new System.Windows.Forms.Panel();
            this.lbl2 = new System.Windows.Forms.Label();
            this.txtN4 = new System.Windows.Forms.TextBox();
            this.txtN3 = new System.Windows.Forms.TextBox();
            this.txtN2 = new System.Windows.Forms.TextBox();
            this.txtN1 = new System.Windows.Forms.TextBox();
            this.lbl6 = new System.Windows.Forms.Label();
            this.lbl5 = new System.Windows.Forms.Label();
            this.lbl3 = new System.Windows.Forms.Label();
            this.lbl4 = new System.Windows.Forms.Label();
            this.txtName = new System.Windows.Forms.TextBox();
            this.lbl1 = new System.Windows.Forms.Label();
            this.lbl7 = new System.Windows.Forms.Label();
            this.panel1.SuspendLayout();
            this.SuspendLayout();
            // 
            // btnCalcular
            // 
            this.btnCalcular.Cursor = System.Windows.Forms.Cursors.Hand;
            this.btnCalcular.Font = new System.Drawing.Font("Cascadia Mono", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnCalcular.Location = new System.Drawing.Point(12, 254);
            this.btnCalcular.Name = "btnCalcular";
            this.btnCalcular.Size = new System.Drawing.Size(360, 32);
            this.btnCalcular.TabIndex = 14;
            this.btnCalcular.Text = "CALCULAR";
            this.btnCalcular.UseVisualStyleBackColor = true;
            this.btnCalcular.Click += new System.EventHandler(this.btnCalcular_Click);
            // 
            // panel1
            // 
            this.panel1.BackgroundImage = global::Aula_22_03_2024.Properties.Resources.calcMediaBg;
            this.panel1.Controls.Add(this.lbl7);
            this.panel1.Controls.Add(this.lbl1);
            this.panel1.Controls.Add(this.btnCalcular);
            this.panel1.Controls.Add(this.txtName);
            this.panel1.Controls.Add(this.lbl2);
            this.panel1.Controls.Add(this.txtN4);
            this.panel1.Controls.Add(this.txtN3);
            this.panel1.Controls.Add(this.txtN2);
            this.panel1.Controls.Add(this.txtN1);
            this.panel1.Controls.Add(this.lbl6);
            this.panel1.Controls.Add(this.lbl5);
            this.panel1.Controls.Add(this.lbl3);
            this.panel1.Controls.Add(this.lbl4);
            this.panel1.Location = new System.Drawing.Point(0, 0);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(385, 310);
            this.panel1.TabIndex = 19;
            // 
            // lbl2
            // 
            this.lbl2.Font = new System.Drawing.Font("Cascadia Mono", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl2.ForeColor = System.Drawing.Color.White;
            this.lbl2.Location = new System.Drawing.Point(12, 70);
            this.lbl2.Name = "lbl2";
            this.lbl2.Size = new System.Drawing.Size(360, 20);
            this.lbl2.TabIndex = 20;
            this.lbl2.Text = "Insira suas notas:";
            this.lbl2.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // txtN4
            // 
            this.txtN4.Font = new System.Drawing.Font("Cascadia Mono", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtN4.Location = new System.Drawing.Point(330, 227);
            this.txtN4.Name = "txtN4";
            this.txtN4.Size = new System.Drawing.Size(42, 21);
            this.txtN4.TabIndex = 22;
            // 
            // txtN3
            // 
            this.txtN3.Font = new System.Drawing.Font("Cascadia Mono", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtN3.Location = new System.Drawing.Point(330, 197);
            this.txtN3.Name = "txtN3";
            this.txtN3.Size = new System.Drawing.Size(42, 21);
            this.txtN3.TabIndex = 21;
            // 
            // txtN2
            // 
            this.txtN2.Font = new System.Drawing.Font("Cascadia Mono", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtN2.Location = new System.Drawing.Point(330, 167);
            this.txtN2.Name = "txtN2";
            this.txtN2.Size = new System.Drawing.Size(42, 21);
            this.txtN2.TabIndex = 20;
            // 
            // txtN1
            // 
            this.txtN1.Font = new System.Drawing.Font("Cascadia Mono", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtN1.Location = new System.Drawing.Point(330, 137);
            this.txtN1.Name = "txtN1";
            this.txtN1.Size = new System.Drawing.Size(42, 21);
            this.txtN1.TabIndex = 19;
            // 
            // lbl6
            // 
            this.lbl6.BackColor = System.Drawing.Color.DimGray;
            this.lbl6.Font = new System.Drawing.Font("Cascadia Mono", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl6.ForeColor = System.Drawing.Color.White;
            this.lbl6.Location = new System.Drawing.Point(12, 227);
            this.lbl6.Name = "lbl6";
            this.lbl6.Size = new System.Drawing.Size(312, 20);
            this.lbl6.TabIndex = 16;
            this.lbl6.Text = "Linguagens, Código e suas Tecnologias.....:";
            this.lbl6.TextAlign = System.Drawing.ContentAlignment.MiddleLeft;
            // 
            // lbl5
            // 
            this.lbl5.BackColor = System.Drawing.Color.DimGray;
            this.lbl5.Font = new System.Drawing.Font("Cascadia Mono", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl5.ForeColor = System.Drawing.Color.White;
            this.lbl5.Location = new System.Drawing.Point(12, 197);
            this.lbl5.Name = "lbl5";
            this.lbl5.Size = new System.Drawing.Size(312, 20);
            this.lbl5.TabIndex = 17;
            this.lbl5.Text = "Matemáticas e suas Tecnologias............:";
            this.lbl5.TextAlign = System.Drawing.ContentAlignment.MiddleLeft;
            // 
            // lbl3
            // 
            this.lbl3.BackColor = System.Drawing.Color.DimGray;
            this.lbl3.Font = new System.Drawing.Font("Cascadia Mono", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl3.ForeColor = System.Drawing.Color.White;
            this.lbl3.Location = new System.Drawing.Point(12, 137);
            this.lbl3.Name = "lbl3";
            this.lbl3.Size = new System.Drawing.Size(312, 20);
            this.lbl3.TabIndex = 18;
            this.lbl3.Text = "Ciências Humanas..........................:";
            this.lbl3.TextAlign = System.Drawing.ContentAlignment.MiddleLeft;
            // 
            // lbl4
            // 
            this.lbl4.BackColor = System.Drawing.Color.DimGray;
            this.lbl4.Font = new System.Drawing.Font("Cascadia Mono", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl4.ForeColor = System.Drawing.Color.White;
            this.lbl4.Location = new System.Drawing.Point(12, 167);
            this.lbl4.Name = "lbl4";
            this.lbl4.Size = new System.Drawing.Size(312, 20);
            this.lbl4.TabIndex = 15;
            this.lbl4.Text = "Ciências da Natureza......................:";
            this.lbl4.TextAlign = System.Drawing.ContentAlignment.MiddleLeft;
            // 
            // txtName
            // 
            this.txtName.Font = new System.Drawing.Font("Cascadia Mono", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtName.Location = new System.Drawing.Point(12, 108);
            this.txtName.Name = "txtName";
            this.txtName.Size = new System.Drawing.Size(360, 21);
            this.txtName.TabIndex = 23;
            this.txtName.Enter += new System.EventHandler(this.txtName_Enter);
            this.txtName.Leave += new System.EventHandler(this.txtName_Leave);
            // 
            // lbl1
            // 
            this.lbl1.Font = new System.Drawing.Font("Cascadia Mono", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl1.ForeColor = System.Drawing.Color.White;
            this.lbl1.Location = new System.Drawing.Point(12, 10);
            this.lbl1.Name = "lbl1";
            this.lbl1.Size = new System.Drawing.Size(360, 20);
            this.lbl1.TabIndex = 24;
            this.lbl1.Text = "A MÉDIA SERÁ CALCULADA SOMENTE COM";
            this.lbl1.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // lbl7
            // 
            this.lbl7.Font = new System.Drawing.Font("Cascadia Mono", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl7.ForeColor = System.Drawing.Color.White;
            this.lbl7.Location = new System.Drawing.Point(12, 30);
            this.lbl7.Name = "lbl7";
            this.lbl7.Size = new System.Drawing.Size(360, 20);
            this.lbl7.TabIndex = 25;
            this.lbl7.Text = "AS 3 MAIORES NOTAS.";
            this.lbl7.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // frmMain
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.Control;
            this.ClientSize = new System.Drawing.Size(384, 304);
            this.Controls.Add(this.panel1);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedSingle;
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.MaximizeBox = false;
            this.MinimizeBox = false;
            this.Name = "frmMain";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "CÁLCULO DE MÉDIA";
            this.Load += new System.EventHandler(this.frmMain_Load);
            this.panel1.ResumeLayout(false);
            this.panel1.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion
        private System.Windows.Forms.Button btnCalcular;
        private System.Windows.Forms.Label lbl3;
        private System.Windows.Forms.Label lbl5;
        private System.Windows.Forms.Label lbl6;
        private System.Windows.Forms.Label lbl4;
        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.TextBox txtN4;
        private System.Windows.Forms.TextBox txtN3;
        private System.Windows.Forms.TextBox txtN2;
        private System.Windows.Forms.TextBox txtN1;
        private System.Windows.Forms.Label lbl2;
        private System.Windows.Forms.TextBox txtName;
        private System.Windows.Forms.Label lbl1;
        private System.Windows.Forms.Label lbl7;
    }
}


namespace aula_05_04_2024_loops
{
    partial class Form1
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
            this.label1 = new System.Windows.Forms.Label();
            this.btnWhile = new System.Windows.Forms.Button();
            this.btnDoWhile = new System.Windows.Forms.Button();
            this.btnFor = new System.Windows.Forms.Button();
            this.txtNumber = new System.Windows.Forms.TextBox();
            this.BtnTabuada = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.BackColor = System.Drawing.Color.BlueViolet;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(12, 50);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(360, 38);
            this.label1.TabIndex = 0;
            this.label1.Text = "TESTE COM LAÇOS (LOOPS)";
            this.label1.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // btnWhile
            // 
            this.btnWhile.Cursor = System.Windows.Forms.Cursors.Hand;
            this.btnWhile.Location = new System.Drawing.Point(12, 168);
            this.btnWhile.Name = "btnWhile";
            this.btnWhile.Size = new System.Drawing.Size(360, 46);
            this.btnWhile.TabIndex = 2;
            this.btnWhile.Text = "WHILE(+)";
            this.btnWhile.UseVisualStyleBackColor = true;
            this.btnWhile.Click += new System.EventHandler(this.BtnWhile_Click);
            // 
            // btnDoWhile
            // 
            this.btnDoWhile.Cursor = System.Windows.Forms.Cursors.Hand;
            this.btnDoWhile.Location = new System.Drawing.Point(12, 220);
            this.btnDoWhile.Name = "btnDoWhile";
            this.btnDoWhile.Size = new System.Drawing.Size(360, 46);
            this.btnDoWhile.TabIndex = 3;
            this.btnDoWhile.Text = "DO WHILE(-)";
            this.btnDoWhile.UseVisualStyleBackColor = true;
            this.btnDoWhile.Click += new System.EventHandler(this.BtnDoWhile_Click);
            // 
            // btnFor
            // 
            this.btnFor.Cursor = System.Windows.Forms.Cursors.Hand;
            this.btnFor.Location = new System.Drawing.Point(12, 272);
            this.btnFor.Name = "btnFor";
            this.btnFor.Size = new System.Drawing.Size(360, 46);
            this.btnFor.TabIndex = 4;
            this.btnFor.Text = "FOR(*)";
            this.btnFor.UseVisualStyleBackColor = true;
            this.btnFor.Click += new System.EventHandler(this.BtnFor_Click);
            // 
            // txtNumber
            // 
            this.txtNumber.Font = new System.Drawing.Font("Microsoft Sans Serif", 18F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtNumber.Location = new System.Drawing.Point(12, 120);
            this.txtNumber.MaxLength = 256;
            this.txtNumber.Name = "txtNumber";
            this.txtNumber.Size = new System.Drawing.Size(360, 35);
            this.txtNumber.TabIndex = 1;
            // 
            // BtnTabuada
            // 
            this.BtnTabuada.Cursor = System.Windows.Forms.Cursors.Hand;
            this.BtnTabuada.Location = new System.Drawing.Point(12, 324);
            this.BtnTabuada.Name = "BtnTabuada";
            this.BtnTabuada.Size = new System.Drawing.Size(360, 46);
            this.BtnTabuada.TabIndex = 5;
            this.BtnTabuada.Text = "TABUADA(*)";
            this.BtnTabuada.UseVisualStyleBackColor = true;
            this.BtnTabuada.Click += new System.EventHandler(this.BtnTabuada_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(384, 450);
            this.Controls.Add(this.BtnTabuada);
            this.Controls.Add(this.txtNumber);
            this.Controls.Add(this.btnFor);
            this.Controls.Add(this.btnDoWhile);
            this.Controls.Add(this.btnWhile);
            this.Controls.Add(this.label1);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedSingle;
            this.MaximizeBox = false;
            this.MinimizeBox = false;
            this.Name = "Form1";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "APRENDENDO LAÇOS DE REPETIÇÃO";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Button btnWhile;
        private System.Windows.Forms.Button btnDoWhile;
        private System.Windows.Forms.Button btnFor;
        private System.Windows.Forms.TextBox txtNumber;
        private System.Windows.Forms.Button BtnTabuada;
    }
}


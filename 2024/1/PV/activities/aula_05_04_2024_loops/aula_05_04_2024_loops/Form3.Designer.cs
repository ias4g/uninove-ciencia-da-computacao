namespace aula_05_04_2024_loops
{
    partial class FrmOptions
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.CbOptions = new System.Windows.Forms.ComboBox();
            this.BtnNext = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // CbOptions
            // 
            this.CbOptions.DisplayMember = "*";
            this.CbOptions.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.CbOptions.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.CbOptions.ImeMode = System.Windows.Forms.ImeMode.Disable;
            this.CbOptions.Items.AddRange(new object[] {
            "+",
            "-",
            "*",
            "/"});
            this.CbOptions.Location = new System.Drawing.Point(12, 12);
            this.CbOptions.Name = "CbOptions";
            this.CbOptions.Size = new System.Drawing.Size(160, 28);
            this.CbOptions.TabIndex = 0;
            // 
            // BtnNext
            // 
            this.BtnNext.Cursor = System.Windows.Forms.Cursors.Hand;
            this.BtnNext.Location = new System.Drawing.Point(12, 60);
            this.BtnNext.Name = "BtnNext";
            this.BtnNext.Size = new System.Drawing.Size(160, 42);
            this.BtnNext.TabIndex = 1;
            this.BtnNext.Text = "PRÓXIMO";
            this.BtnNext.UseVisualStyleBackColor = true;
            this.BtnNext.Click += new System.EventHandler(this.BtnNext_Click);
            // 
            // FrmOptions
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(184, 121);
            this.Controls.Add(this.BtnNext);
            this.Controls.Add(this.CbOptions);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedSingle;
            this.MaximizeBox = false;
            this.MinimizeBox = false;
            this.Name = "FrmOptions";
            this.ShowIcon = false;
            this.ShowInTaskbar = false;
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Selecione uma operação";
            this.ResumeLayout(false);

        }

        #endregion
        private System.Windows.Forms.Button BtnNext;
        private System.Windows.Forms.ComboBox CbOptions;
    }
}
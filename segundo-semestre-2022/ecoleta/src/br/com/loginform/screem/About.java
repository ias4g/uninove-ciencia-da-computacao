package br.com.loginform.screem;

import java.awt.CardLayout;
import java.awt.Color;

public class About extends javax.swing.JDialog {

    public About(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        getContentPane().setBackground(new Color(102, 102, 102));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblEcoleta = new br.com.loginform.components.JLabelRoundedBorder();
        lblCompilation = new br.com.loginform.components.JLabelRoundedBorder();
        lblLegais = new br.com.loginform.components.JLabelRoundedBorder();
        jpMain = new br.com.loginform.components.JPanelRoundedBorder();
        jpEcoleta = new br.com.loginform.components.JPanelRoundedBorder();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jpCompilation = new br.com.loginform.components.JPanelRoundedBorder();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea11 = new javax.swing.JTextArea();
        jpLegais = new br.com.loginform.components.JPanelRoundedBorder();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jTextArea5 = new javax.swing.JTextArea();
        lblClose = new br.com.loginform.components.JLabelRoundedBorder();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setMaximumSize(new java.awt.Dimension(500, 400));
        setMinimumSize(new java.awt.Dimension(500, 400));
        setModal(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));
        jPanel1.setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/logo.png"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(16, 16, 112, 32);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/GNU.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(348, 16, 136, 32);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 500, 60);

        lblEcoleta.setBackground(new java.awt.Color(255, 255, 255));
        lblEcoleta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEcoleta.setText("Ecoleta");
        lblEcoleta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEcoletaMouseClicked(evt);
            }
        });
        getContentPane().add(lblEcoleta);
        lblEcoleta.setBounds(32, 70, 80, 30);

        lblCompilation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCompilation.setText("Informações de Compilação");
        lblCompilation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCompilationMouseClicked(evt);
            }
        });
        getContentPane().add(lblCompilation);
        lblCompilation.setBounds(112, 70, 200, 30);

        lblLegais.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLegais.setText("Informações Legais");
        lblLegais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLegaisMouseClicked(evt);
            }
        });
        getContentPane().add(lblLegais);
        lblLegais.setBounds(312, 70, 140, 30);

        jpMain.setLayout(new java.awt.CardLayout());

        jpEcoleta.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Ecoleta v1.0");
        jpEcoleta.add(jLabel4);
        jLabel4.setBounds(16, 30, 436, 20);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Você está com a ultima versão deste software.");
        jpEcoleta.add(jLabel3);
        jLabel3.setBounds(16, 60, 436, 20);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Sistema para cadastro de ponto de coleta de resíduos");
        jpEcoleta.add(jLabel5);
        jLabel5.setBounds(16, 80, 436, 20);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Desenvolvido durante o 2º semestre do curso de ciência da computação.");
        jpEcoleta.add(jLabel6);
        jLabel6.setBounds(20, 120, 436, 20);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Trabalho de conclusão de semestre.");
        jpEcoleta.add(jLabel7);
        jLabel7.setBounds(20, 140, 436, 20);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Pela Universidade Nove de Julho.");
        jpEcoleta.add(jLabel8);
        jLabel8.setBounds(20, 160, 436, 20);

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("orgânicos e não orgânicos.");
        jpEcoleta.add(jLabel31);
        jLabel31.setBounds(16, 100, 436, 20);

        jpMain.add(jpEcoleta, "cardEcoleta");

        jpCompilation.setLayout(null);

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea11.setEditable(false);
        jTextArea11.setColumns(20);
        jTextArea11.setLineWrap(true);
        jTextArea11.setRows(5);
        jTextArea11.setText("ECOLETA DESKTOP is an open source project published under the GNU License.\nYou can view the source code and contribute to this project on GitHUb.\n\nGNU GENERAL PUBLIC LICENSE\nVersion 3, 29 June 2007\n\nCopyright (C) 2007 Free Software Foundation, Inc. <https://fsf.org/>\nEveryone is permitted to copy and distribute verbatim copies\nof this license document, but changing it is not allowed.\n\nPreamble\n\nThe GNU General Public License is a free, copyleft license for\nsoftware and other kinds of works.\n\nThe licenses for most software and other practical works are designed\nto take away your freedom to share and change the works.  By contrast,\nthe GNU General Public License is intended to guarantee your freedom to\nshare and change all versions of a program--to make sure it remains free\nsoftware for all its users.  We, the Free Software Foundation, use the\nGNU General Public License for most of our software; it applies also to\nany other work released this way by its authors.  You can apply it to\nyour programs, too.\n\nWhen we speak of free software, we are referring to freedom, not\nprice.  Our General Public Licenses are designed to make sure that you\nhave the freedom to distribute copies of free software (and charge for\nthem if you wish), that you receive source code or can get it if you\nwant it, that you can change the software or use pieces of it in new\nfree programs, and that you know you can do these things.\n\nTo protect your rights, we need to prevent others from denying you\nthese rights or asking you to surrender the rights.  Therefore, you have\ncertain responsibilities if you distribute copies of the software, or if\nyou modify it: responsibilities to respect the freedom of others.\n\nFor example, if you distribute copies of such a program, whether\ngratis or for a fee, you must pass on to the recipients the same\nfreedoms that you received.  You must make sure that they, too, receive\nor can get the source code.  And you must show them these terms so they\nknow their rights.\n\nDevelopers that use the GNU GPL protect your rights with two steps:\n(1) assert copyright on the software, and (2) offer you this License\ngiving you legal permission to copy, distribute and/or modify it.\n\nFor the developers' and authors' protection, the GPL clearly explains\nthat there is no warranty for this free software.  For both users' and\nauthors' sake, the GPL requires that modified versions be marked as\nchanged, so that their problems will not be attributed erroneously to\nauthors of previous versions.\n\nSome devices are designed to deny users access to install or run\nmodified versions of the software inside them, although the manufacturer\ncan do so.  This is fundamentally incompatible with the aim of\nprotecting users' freedom to change the software.  The systematic\npattern of such abuse occurs in the area of products for individuals to\nuse, which is precisely where it is most unacceptable.  Therefore, we\nhave designed this version of the GPL to prohibit the practice for those\nproducts.  If such problems arise substantially in other domains, we\nstand ready to extend this provision to those domains in future versions\nof the GPL, as needed to protect the freedom of users.\n\nFinally, every program is threatened constantly by software patents.\nStates should not allow patents to restrict development and use of\nsoftware on general-purpose computers, but in those that do, we wish to\navoid the special danger that patents applied to a free program could\nmake it effectively proprietary.  To prevent this, the GPL assures that\npatents cannot be used to render the program non-free.\n\nThe precise terms and conditions for copying, distribution and\nmodification follow.\n\nTERMS AND CONDITIONS\n\n0. Definitions.\n\n\"This License\" refers to version 3 of the GNU General Public License.\n\n\"Copyright\" also means copyright-like laws that apply to other kinds of\nworks, such as semiconductor masks.\n\n\"The Program\" refers to any copyrightable work licensed under this\nLicense.  Each licensee is addressed as \"you\".  \"Licensees\" and\n\"recipients\" may be individuals or organizations.\n\nTo \"modify\" a work means to copy from or adapt all or part of the work\nin a fashion requiring copyright permission, other than the making of an\nexact copy.  The resulting work is called a \"modified version\" of the\nearlier work or a work \"based on\" the earlier work.\n\nA \"covered work\" means either the unmodified Program or a work based\non the Program.\n\nTo \"propagate\" a work means to do anything with it that, without\npermission, would make you directly or secondarily liable for\ninfringement under applicable copyright law, except executing it on a\ncomputer or modifying a private copy.  Propagation includes copying,\ndistribution (with or without modification), making available to the\npublic, and in some countries other activities as well.\n\nTo \"convey\" a work means any kind of propagation that enables other\nparties to make or receive copies.  Mere interaction with a user through\na computer network, with no transfer of a copy, is not conveying.\n\nAn interactive user interface displays \"Appropriate Legal Notices\"\nto the extent that it includes a convenient and prominently visible\nfeature that (1) displays an appropriate copyright notice, and (2)\ntells the user that there is no warranty for the work (except to the\nextent that warranties are provided), that licensees may convey the\nwork under this License, and how to view a copy of this License.  If\nthe interface presents a list of user commands or options, such as a\nmenu, a prominent item in the list meets this criterion.\n\n1. Source Code.\n\nThe \"source code\" for a work means the preferred form of the work\nfor making modifications to it.  \"Object code\" means any non-source\nform of a work.\n\nA \"Standard Interface\" means an interface that either is an official\nstandard defined by a recognized standards body, or, in the case of\ninterfaces specified for a particular programming language, one that\nis widely used among developers working in that language.\n\nThe \"System Libraries\" of an executable work include anything, other\nthan the work as a whole, that (a) is included in the normal form of\npackaging a Major Component, but which is not part of that Major\nComponent, and (b) serves only to enable use of the work with that\nMajor Component, or to implement a Standard Interface for which an\nimplementation is available to the public in source code form.  A\n\"Major Component\", in this context, means a major essential component\n(kernel, window system, and so on) of the specific operating system\n(if any) on which the executable work runs, or a compiler used to\nproduce the work, or an object code interpreter used to run it.\n\nThe \"Corresponding Source\" for a work in object code form means all\nthe source code needed to generate, install, and (for an executable\nwork) run the object code and to modify the work, including scripts to\ncontrol those activities.  However, it does not include the work's\nSystem Libraries, or general-purpose tools or generally available free\nprograms which are used unmodified in performing those activities but\nwhich are not part of the work.  For example, Corresponding Source\nincludes interface definition files associated with source files for\nthe work, and the source code for shared libraries and dynamically\nlinked subprograms that the work is specifically designed to require,\nsuch as by intimate data communication or control flow between those\nsubprograms and other parts of the work.\n\nThe Corresponding Source need not include anything that users\ncan regenerate automatically from other parts of the Corresponding\nSource.\n\nThe Corresponding Source for a work in source code form is that\nsame work.\n\n2. Basic Permissions.\n\nAll rights granted under this License are granted for the term of\ncopyright on the Program, and are irrevocable provided the stated\nconditions are met.  This License explicitly affirms your unlimited\npermission to run the unmodified Program.  The output from running a\ncovered work is covered by this License only if the output, given its\ncontent, constitutes a covered work.  This License acknowledges your\nrights of fair use or other equivalent, as provided by copyright law.\n\nYou may make, run and propagate covered works that you do not\nconvey, without conditions so long as your license otherwise remains\nin force.  You may convey covered works to others for the sole purpose\nof having them make modifications exclusively for you, or provide you\nwith facilities for running those works, provided that you comply with\nthe terms of this License in conveying all material for which you do\nnot control copyright.  Those thus making or running the covered works\nfor you must do so exclusively on your behalf, under your direction\nand control, on terms that prohibit them from making any copies of\nyour copyrighted material outside their relationship with you.\n\nConveying under any other circumstances is permitted solely under\nthe conditions stated below.  Sublicensing is not allowed; section 10\nmakes it unnecessary.\n\n3. Protecting Users' Legal Rights From Anti-Circumvention Law.\n\nNo covered work shall be deemed part of an effective technological\nmeasure under any applicable law fulfilling obligations under article\n11 of the WIPO copyright treaty adopted on 20 December 1996, or\nsimilar laws prohibiting or restricting circumvention of such\nmeasures.\n\nWhen you convey a covered work, you waive any legal power to forbid\ncircumvention of technological measures to the extent such circumvention\nis effected by exercising rights under this License with respect to\nthe covered work, and you disclaim any intention to limit operation or\nmodification of the work as a means of enforcing, against the work's\nusers, your or third parties' legal rights to forbid circumvention of\ntechnological measures.\n\n4. Conveying Verbatim Copies.\n\nYou may convey verbatim copies of the Program's source code as you\nreceive it, in any medium, provided that you conspicuously and\nappropriately publish on each copy an appropriate copyright notice;\nkeep intact all notices stating that this License and any\nnon-permissive terms added in accord with section 7 apply to the code;\nkeep intact all notices of the absence of any warranty; and give all\nrecipients a copy of this License along with the Program.\n\nYou may charge any price or no price for each copy that you convey,\nand you may offer support or warranty protection for a fee.\n\n5. Conveying Modified Source Versions.\n\nYou may convey a work based on the Program, or the modifications to\nproduce it from the Program, in the form of source code under the\nterms of section 4, provided that you also meet all of these conditions:\n\na) The work must carry prominent notices stating that you modified\nit, and giving a relevant date.\n\nb) The work must carry prominent notices stating that it is\nreleased under this License and any conditions added under section\n7.  This requirement modifies the requirement in section 4 to\n\"keep intact all notices\".\n\nc) You must license the entire work, as a whole, under this\nLicense to anyone who comes into possession of a copy.  This\nLicense will therefore apply, along with any applicable section 7\nadditional terms, to the whole of the work, and all its parts,\nregardless of how they are packaged.  This License gives no\npermission to license the work in any other way, but it does not\ninvalidate such permission if you have separately received it.\n\nd) If the work has interactive user interfaces, each must display\nAppropriate Legal Notices; however, if the Program has interactive\ninterfaces that do not display Appropriate Legal Notices, your\nwork need not make them do so.\n\nA compilation of a covered work with other separate and independent\nworks, which are not by their nature extensions of the covered work,\nand which are not combined with it such as to form a larger program,\nin or on a volume of a storage or distribution medium, is called an\n\"aggregate\" if the compilation and its resulting copyright are not\nused to limit the access or legal rights of the compilation's users\nbeyond what the individual works permit.  Inclusion of a covered work\nin an aggregate does not cause this License to apply to the other\nparts of the aggregate.\n\n6. Conveying Non-Source Forms.\n\nYou may convey a covered work in object code form under the terms\nof sections 4 and 5, provided that you also convey the\nmachine-readable Corresponding Source under the terms of this License,\nin one of these ways:\n\na) Convey the object code in, or embodied in, a physical product\n(including a physical distribution medium), accompanied by the\nCorresponding Source fixed on a durable physical medium\ncustomarily used for software interchange.\n\nb) Convey the object code in, or embodied in, a physical product\n(including a physical distribution medium), accompanied by a\nwritten offer, valid for at least three years and valid for as\nlong as you offer spare parts or customer support for that product\nmodel, to give anyone who possesses the object code either (1) a\ncopy of the Corresponding Source for all the software in the\nproduct that is covered by this License, on a durable physical\nmedium customarily used for software interchange, for a price no\nmore than your reasonable cost of physically performing this\nconveying of source, or (2) access to copy the\nCorresponding Source from a network server at no charge.\n\nc) Convey individual copies of the object code with a copy of the\nwritten offer to provide the Corresponding Source.  This\nalternative is allowed only occasionally and noncommercially, and\nonly if you received the object code with such an offer, in accord\nwith subsection 6b.\n\nd) Convey the object code by offering access from a designated\nplace (gratis or for a charge), and offer equivalent access to the\nCorresponding Source in the same way through the same place at no\nfurther charge.  You need not require recipients to copy the\nCorresponding Source along with the object code.  If the place to\ncopy the object code is a network server, the Corresponding Source\nmay be on a different server (operated by you or a third party)\nthat supports equivalent copying facilities, provided you maintain\nclear directions next to the object code saying where to find the\nCorresponding Source.  Regardless of what server hosts the\nCorresponding Source, you remain obligated to ensure that it is\navailable for as long as needed to satisfy these requirements.\n\ne) Convey the object code using peer-to-peer transmission, provided\nyou inform other peers where the object code and Corresponding\nSource of the work are being offered to the general public at no\ncharge under subsection 6d.\n\nA separable portion of the object code, whose source code is excluded\nfrom the Corresponding Source as a System Library, need not be\nincluded in conveying the object code work.\n\nA \"User Product\" is either (1) a \"consumer product\", which means any\ntangible personal property which is normally used for personal, family,\nor household purposes, or (2) anything designed or sold for incorporation\ninto a dwelling.  In determining whether a product is a consumer product,\ndoubtful cases shall be resolved in favor of coverage.  For a particular\nproduct received by a particular user, \"normally used\" refers to a\ntypical or common use of that class of product, regardless of the status\nof the particular user or of the way in which the particular user\nactually uses, or expects or is expected to use, the product.  A product\nis a consumer product regardless of whether the product has substantial\ncommercial, industrial or non-consumer uses, unless such uses represent\nthe only significant mode of use of the product.\n\n\"Installation Information\" for a User Product means any methods,\nprocedures, authorization keys, or other information required to install\nand execute modified versions of a covered work in that User Product from\na modified version of its Corresponding Source.  The information must\nsuffice to ensure that the continued functioning of the modified object\ncode is in no case prevented or interfered with solely because\nmodification has been made.\n\nIf you convey an object code work under this section in, or with, or\nspecifically for use in, a User Product, and the conveying occurs as\npart of a transaction in which the right of possession and use of the\nUser Product is transferred to the recipient in perpetuity or for a\nfixed term (regardless of how the transaction is characterized), the\nCorresponding Source conveyed under this section must be accompanied\nby the Installation Information.  But this requirement does not apply\nif neither you nor any third party retains the ability to install\nmodified object code on the User Product (for example, the work has\nbeen installed in ROM).\n\nThe requirement to provide Installation Information does not include a\nrequirement to continue to provide support service, warranty, or updates\nfor a work that has been modified or installed by the recipient, or for\nthe User Product in which it has been modified or installed.  Access to a\nnetwork may be denied when the modification itself materially and\nadversely affects the operation of the network or violates the rules and\nprotocols for communication across the network.\n\nCorresponding Source conveyed, and Installation Information provided,\nin accord with this section must be in a format that is publicly\ndocumented (and with an implementation available to the public in\nsource code form), and must require no special password or key for\nunpacking, reading or copying.\n\n7. Additional Terms.\n\n\"Additional permissions\" are terms that supplement the terms of this\nLicense by making exceptions from one or more of its conditions.\nAdditional permissions that are applicable to the entire Program shall\nbe treated as though they were included in this License, to the extent\nthat they are valid under applicable law.  If additional permissions\napply only to part of the Program, that part may be used separately\nunder those permissions, but the entire Program remains governed by\nthis License without regard to the additional permissions.\n\nWhen you convey a copy of a covered work, you may at your option\nremove any additional permissions from that copy, or from any part of\nit.  (Additional permissions may be written to require their own\nremoval in certain cases when you modify the work.)  You may place\nadditional permissions on material, added by you to a covered work,\nfor which you have or can give appropriate copyright permission.\n\nNotwithstanding any other provision of this License, for material you\nadd to a covered work, you may (if authorized by the copyright holders of\nthat material) supplement the terms of this License with terms:\n\na) Disclaiming warranty or limiting liability differently from the\nterms of sections 15 and 16 of this License; or\n\nb) Requiring preservation of specified reasonable legal notices or\nauthor attributions in that material or in the Appropriate Legal\nNotices displayed by works containing it; or\n\nc) Prohibiting misrepresentation of the origin of that material, or\nrequiring that modified versions of such material be marked in\nreasonable ways as different from the original version; or\n\nd) Limiting the use for publicity purposes of names of licensors or\nauthors of the material; or\n\ne) Declining to grant rights under trademark law for use of some\ntrade names, trademarks, or service marks; or\n\nf) Requiring indemnification of licensors and authors of that\nmaterial by anyone who conveys the material (or modified versions of\nit) with contractual assumptions of liability to the recipient, for\nany liability that these contractual assumptions directly impose on\nthose licensors and authors.\n\nAll other non-permissive additional terms are considered \"further\nrestrictions\" within the meaning of section 10.  If the Program as you\nreceived it, or any part of it, contains a notice stating that it is\ngoverned by this License along with a term that is a further\nrestriction, you may remove that term.  If a license document contains\na further restriction but permits relicensing or conveying under this\nLicense, you may add to a covered work material governed by the terms\nof that license document, provided that the further restriction does\nnot survive such relicensing or conveying.\n\nIf you add terms to a covered work in accord with this section, you\nmust place, in the relevant source files, a statement of the\nadditional terms that apply to those files, or a notice indicating\nwhere to find the applicable terms.\n\nAdditional terms, permissive or non-permissive, may be stated in the\nform of a separately written license, or stated as exceptions;\nthe above requirements apply either way.\n\n8. Termination.\n\nYou may not propagate or modify a covered work except as expressly\nprovided under this License.  Any attempt otherwise to propagate or\nmodify it is void, and will automatically terminate your rights under\nthis License (including any patent licenses granted under the third\nparagraph of section 11).\n\nHowever, if you cease all violation of this License, then your\nlicense from a particular copyright holder is reinstated (a)\nprovisionally, unless and until the copyright holder explicitly and\nfinally terminates your license, and (b) permanently, if the copyright\nholder fails to notify you of the violation by some reasonable means\nprior to 60 days after the cessation.\n\nMoreover, your license from a particular copyright holder is\nreinstated permanently if the copyright holder notifies you of the\nviolation by some reasonable means, this is the first time you have\nreceived notice of violation of this License (for any work) from that\ncopyright holder, and you cure the violation prior to 30 days after\nyour receipt of the notice.\n\nTermination of your rights under this section does not terminate the\nlicenses of parties who have received copies or rights from you under\nthis License.  If your rights have been terminated and not permanently\nreinstated, you do not qualify to receive new licenses for the same\nmaterial under section 10.\n\n9. Acceptance Not Required for Having Copies.\n\nYou are not required to accept this License in order to receive or\nrun a copy of the Program.  Ancillary propagation of a covered work\noccurring solely as a consequence of using peer-to-peer transmission\nto receive a copy likewise does not require acceptance.  However,\nnothing other than this License grants you permission to propagate or\nmodify any covered work.  These actions infringe copyright if you do\nnot accept this License.  Therefore, by modifying or propagating a\ncovered work, you indicate your acceptance of this License to do so.\n\n10. Automatic Licensing of Downstream Recipients.\n\nEach time you convey a covered work, the recipient automatically\nreceives a license from the original licensors, to run, modify and\npropagate that work, subject to this License.  You are not responsible\nfor enforcing compliance by third parties with this License.\n\nAn \"entity transaction\" is a transaction transferring control of an\norganization, or substantially all assets of one, or subdividing an\norganization, or merging organizations.  If propagation of a covered\nwork results from an entity transaction, each party to that\ntransaction who receives a copy of the work also receives whatever\nlicenses to the work the party's predecessor in interest had or could\ngive under the previous paragraph, plus a right to possession of the\nCorresponding Source of the work from the predecessor in interest, if\nthe predecessor has it or can get it with reasonable efforts.\n\nYou may not impose any further restrictions on the exercise of the\nrights granted or affirmed under this License.  For example, you may\nnot impose a license fee, royalty, or other charge for exercise of\nrights granted under this License, and you may not initiate litigation\n(including a cross-claim or counterclaim in a lawsuit) alleging that\nany patent claim is infringed by making, using, selling, offering for\nsale, or importing the Program or any portion of it.\n\n11. Patents.\n\nA \"contributor\" is a copyright holder who authorizes use under this\nLicense of the Program or a work on which the Program is based.  The\nwork thus licensed is called the contributor's \"contributor version\".\n\nA contributor's \"essential patent claims\" are all patent claims\nowned or controlled by the contributor, whether already acquired or\nhereafter acquired, that would be infringed by some manner, permitted\nby this License, of making, using, or selling its contributor version,\nbut do not include claims that would be infringed only as a\nconsequence of further modification of the contributor version.  For\npurposes of this definition, \"control\" includes the right to grant\npatent sublicenses in a manner consistent with the requirements of\nthis License.\n\nEach contributor grants you a non-exclusive, worldwide, royalty-free\npatent license under the contributor's essential patent claims, to\nmake, use, sell, offer for sale, import and otherwise run, modify and\npropagate the contents of its contributor version.\n\nIn the following three paragraphs, a \"patent license\" is any express\nagreement or commitment, however denominated, not to enforce a patent\n(such as an express permission to practice a patent or covenant not to\nsue for patent infringement).  To \"grant\" such a patent license to a\nparty means to make such an agreement or commitment not to enforce a\npatent against the party.\n\nIf you convey a covered work, knowingly relying on a patent license,\nand the Corresponding Source of the work is not available for anyone\nto copy, free of charge and under the terms of this License, through a\npublicly available network server or other readily accessible means,\nthen you must either (1) cause the Corresponding Source to be so\navailable, or (2) arrange to deprive yourself of the benefit of the\npatent license for this particular work, or (3) arrange, in a manner\nconsistent with the requirements of this License, to extend the patent\nlicense to downstream recipients.  \"Knowingly relying\" means you have\nactual knowledge that, but for the patent license, your conveying the\ncovered work in a country, or your recipient's use of the covered work\nin a country, would infringe one or more identifiable patents in that\ncountry that you have reason to believe are valid.\n\nIf, pursuant to or in connection with a single transaction or\narrangement, you convey, or propagate by procuring conveyance of, a\ncovered work, and grant a patent license to some of the parties\nreceiving the covered work authorizing them to use, propagate, modify\nor convey a specific copy of the covered work, then the patent license\nyou grant is automatically extended to all recipients of the covered\nwork and works based on it.\n\nA patent license is \"discriminatory\" if it does not include within\nthe scope of its coverage, prohibits the exercise of, or is\nconditioned on the non-exercise of one or more of the rights that are\nspecifically granted under this License.  You may not convey a covered\nwork if you are a party to an arrangement with a third party that is\nin the business of distributing software, under which you make payment\nto the third party based on the extent of your activity of conveying\nthe work, and under which the third party grants, to any of the\nparties who would receive the covered work from you, a discriminatory\npatent license (a) in connection with copies of the covered work\nconveyed by you (or copies made from those copies), or (b) primarily\nfor and in connection with specific products or compilations that\ncontain the covered work, unless you entered into that arrangement,\nor that patent license was granted, prior to 28 March 2007.\n\nNothing in this License shall be construed as excluding or limiting\nany implied license or other defenses to infringement that may\notherwise be available to you under applicable patent law.\n\n12. No Surrender of Others' Freedom.\n\nIf conditions are imposed on you (whether by court order, agreement or\notherwise) that contradict the conditions of this License, they do not\nexcuse you from the conditions of this License.  If you cannot convey a\ncovered work so as to satisfy simultaneously your obligations under this\nLicense and any other pertinent obligations, then as a consequence you may\nnot convey it at all.  For example, if you agree to terms that obligate you\nto collect a royalty for further conveying from those to whom you convey\nthe Program, the only way you could satisfy both those terms and this\nLicense would be to refrain entirely from conveying the Program.\n\n13. Use with the GNU Affero General Public License.\n\nNotwithstanding any other provision of this License, you have\npermission to link or combine any covered work with a work licensed\nunder version 3 of the GNU Affero General Public License into a single\ncombined work, and to convey the resulting work.  The terms of this\nLicense will continue to apply to the part which is the covered work,\nbut the special requirements of the GNU Affero General Public License,\nsection 13, concerning interaction through a network will apply to the\ncombination as such.\n\n14. Revised Versions of this License.\n\nThe Free Software Foundation may publish revised and/or new versions of\nthe GNU General Public License from time to time.  Such new versions will\nbe similar in spirit to the present version, but may differ in detail to\naddress new problems or concerns.\n\nEach version is given a distinguishing version number.  If the\nProgram specifies that a certain numbered version of the GNU General\nPublic License \"or any later version\" applies to it, you have the\noption of following the terms and conditions either of that numbered\nversion or of any later version published by the Free Software\nFoundation.  If the Program does not specify a version number of the\nGNU General Public License, you may choose any version ever published\nby the Free Software Foundation.\n\nIf the Program specifies that a proxy can decide which future\nversions of the GNU General Public License can be used, that proxy's\npublic statement of acceptance of a version permanently authorizes you\nto choose that version for the Program.\n\nLater license versions may give you additional or different\npermissions.  However, no additional obligations are imposed on any\nauthor or copyright holder as a result of your choosing to follow a\nlater version.\n\n15. Disclaimer of Warranty.\n\nTHERE IS NO WARRANTY FOR THE PROGRAM, TO THE EXTENT PERMITTED BY\nAPPLICABLE LAW.  EXCEPT WHEN OTHERWISE STATED IN WRITING THE COPYRIGHT\nHOLDERS AND/OR OTHER PARTIES PROVIDE THE PROGRAM \"AS IS\" WITHOUT WARRANTY\nOF ANY KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING, BUT NOT LIMITED TO,\nTHE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR\nPURPOSE.  THE ENTIRE RISK AS TO THE QUALITY AND PERFORMANCE OF THE PROGRAM\nIS WITH YOU.  SHOULD THE PROGRAM PROVE DEFECTIVE, YOU ASSUME THE COST OF\nALL NECESSARY SERVICING, REPAIR OR CORRECTION.\n\n16. Limitation of Liability.\n\nIN NO EVENT UNLESS REQUIRED BY APPLICABLE LAW OR AGREED TO IN WRITING\nWILL ANY COPYRIGHT HOLDER, OR ANY OTHER PARTY WHO MODIFIES AND/OR CONVEYS\nTHE PROGRAM AS PERMITTED ABOVE, BE LIABLE TO YOU FOR DAMAGES, INCLUDING ANY\nGENERAL, SPECIAL, INCIDENTAL OR CONSEQUENTIAL DAMAGES ARISING OUT OF THE\nUSE OR INABILITY TO USE THE PROGRAM (INCLUDING BUT NOT LIMITED TO LOSS OF\nDATA OR DATA BEING RENDERED INACCURATE OR LOSSES SUSTAINED BY YOU OR THIRD\nPARTIES OR A FAILURE OF THE PROGRAM TO OPERATE WITH ANY OTHER PROGRAMS),\nEVEN IF SUCH HOLDER OR OTHER PARTY HAS BEEN ADVISED OF THE POSSIBILITY OF\nSUCH DAMAGES.\n\n17. Interpretation of Sections 15 and 16.\n\nIf the disclaimer of warranty and limitation of liability provided\nabove cannot be given local legal effect according to their terms,\nreviewing courts shall apply local law that most closely approximates\nan absolute waiver of all civil liability in connection with the\nProgram, unless a warranty or assumption of liability accompanies a\ncopy of the Program in return for a fee.\n\nEND OF TERMS AND CONDITIONS\n\nHow to Apply These Terms to Your New Programs\n\nIf you develop a new program, and you want it to be of the greatest\npossible use to the public, the best way to achieve this is to make it\nfree software which everyone can redistribute and change under these terms.\n\nTo do so, attach the following notices to the program.  It is safest\nto attach them to the start of each source file to most effectively\nstate the exclusion of warranty; and each file should have at least\nthe \"copyright\" line and a pointer to where the full notice is found.\n\n<one line to give the program's name and a brief idea of what it does.>\nCopyright (C) <year>  <name of author>\n\nThis program is free software: you can redistribute it and/or modify\nit under the terms of the GNU General Public License as published by\nthe Free Software Foundation, either version 3 of the License, or\n(at your option) any later version.\n\nThis program is distributed in the hope that it will be useful,\nbut WITHOUT ANY WARRANTY; without even the implied warranty of\nMERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the\nGNU General Public License for more details.\n\nYou should have received a copy of the GNU General Public License\nalong with this program.  If not, see <https://www.gnu.org/licenses/>.\n\nAlso add information on how to contact you by electronic and paper mail.\n\nIf the program does terminal interaction, make it output a short\nnotice like this when it starts in an interactive mode:\n\n<program>  Copyright (C) <year>  <name of author>\nThis program comes with ABSOLUTELY NO WARRANTY; for details type `show w'.\nThis is free software, and you are welcome to redistribute it\nunder certain conditions; type `show c' for details.\n\nThe hypothetical commands `show w' and `show c' should show the appropriate\nparts of the General Public License.  Of course, your program's commands\nmight be different; for a GUI interface, you would use an \"about box\".\n\nYou should also get your employer (if you work as a programmer) or school,\nif any, to sign a \"copyright disclaimer\" for the program, if necessary.\nFor more information on this, and how to apply and follow the GNU GPL, see\n<https://www.gnu.org/licenses/>.\n\nThe GNU General Public License does not permit incorporating your program\ninto proprietary programs.  If your program is a subroutine library, you\nmay consider it more useful to permit linking proprietary applications with\nthe library.  If this is what you want to do, use the GNU Lesser General\nPublic License instead of this License.  But first, please read\n<https://www.gnu.org/licenses/why-not-lgpl.html>.\n\n\n");
        jTextArea11.setWrapStyleWord(true);
        jTextArea11.setBorder(null);
        jTextArea11.setCaretPosition(0);
        jScrollPane1.setViewportView(jTextArea11);

        jpCompilation.add(jScrollPane1);
        jScrollPane1.setBounds(16, 20, 436, 200);

        jpMain.add(jpCompilation, "cardCompilation");

        jpLegais.setLayout(null);

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setColumnHeaderView(null);
        jScrollPane2.setRowHeaderView(null);
        jScrollPane2.setViewportView(null);
        jScrollPane2.setWheelScrollingEnabled(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setAutoscrolls(true);
        jPanel2.setMaximumSize(new java.awt.Dimension(436, 640));
        jPanel2.setMinimumSize(new java.awt.Dimension(436, 640));
        jPanel2.setPreferredSize(new java.awt.Dimension(436, 640));
        jPanel2.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel9.setText("Desenvolvedores:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(0, 0, 330, 19);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridLayout(1, 5, 4, 0));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/deyzy.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/github.png"))); // NOI18N
        jLabel11.setText("/deyzy");
        jLabel11.setIconTextGap(0);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel4);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/ratasba.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/github.png"))); // NOI18N
        jLabel13.setText("/ratasba");
        jLabel13.setIconTextGap(0);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setPreferredSize(new java.awt.Dimension(68, 71));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/bielhgsr.png"))); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/github.png"))); // NOI18N
        jLabel15.setText("/bielhgsr");
        jLabel15.setIconTextGap(0);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/ias4g.png"))); // NOI18N

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/github.png"))); // NOI18N
        jLabel17.setText("/ias4g");
        jLabel17.setIconTextGap(0);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/vitorguim2.png"))); // NOI18N

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loginform/assets/github.png"))); // NOI18N
        jLabel19.setText("/vitorguim2");
        jLabel19.setIconTextGap(0);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel12);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 20, 400, 71);

        jLabel20.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel20.setText("Bibliotecas usadas:");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(0, 110, 430, 19);

        jLabel21.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 255));
        jLabel21.setText("https://www.mysql.com/products/connector/");
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel21);
        jLabel21.setBounds(80, 140, 290, 14);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("MySQL provides connectivity for client applications developed in the Java programming language with MySQL Connector/J, a driver that implements the Java Database Connectivity (JDBC) API and also MySQL X DevAPI.");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(null);
        jPanel2.add(jTextArea1);
        jTextArea1.setBounds(16, 160, 400, 70);

        jLabel22.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel22.setText("MySQL:");
        jPanel2.add(jLabel22);
        jLabel22.setBounds(16, 140, 60, 14);

        jLabel23.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel23.setText("Atxy2k:");
        jPanel2.add(jLabel23);
        jLabel23.setBounds(16, 246, 60, 14);

        jLabel24.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 255));
        jLabel24.setText("http://atxy2k.github.io/RestrictedTextField/");
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel24);
        jLabel24.setBounds(80, 246, 290, 14);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("Biblioteca inspirada no comportamento limitado que o componente Swing fornece, um dos problemas comuns na utilização do componente, é muito complexo gerenciar o conteúdo que está sendo escrito, ou seja, não há como validar automaticamente o usuário para digitar certos caracteres que queremos, a menos que seja por código manual.");
        jTextArea2.setWrapStyleWord(true);
        jTextArea2.setBorder(null);
        jTextArea2.setCaretPosition(0);
        jPanel2.add(jTextArea2);
        jTextArea2.setBounds(16, 265, 400, 100);

        jLabel25.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel25.setText("Dom4j:");
        jPanel2.add(jLabel25);
        jLabel25.setBounds(16, 381, 60, 14);

        jLabel26.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 255));
        jLabel26.setText("https://dom4j.github.io/");
        jLabel26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel26);
        jLabel26.setBounds(80, 381, 290, 14);

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(5);
        jTextArea3.setText("dom4j é uma biblioteca Java de código aberto para trabalhar com XML, XPath e XSLT. É compatível com os padrões DOM, SAX e JAXP.");
        jTextArea3.setWrapStyleWord(true);
        jTextArea3.setBorder(null);
        jTextArea3.setCaretPosition(0);
        jPanel2.add(jTextArea3);
        jTextArea3.setBounds(16, 400, 400, 40);

        jLabel27.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel27.setText("Gson:");
        jPanel2.add(jLabel27);
        jLabel27.setBounds(16, 456, 60, 14);

        jLabel28.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 51, 255));
        jLabel28.setText("https://github.com/google/gson");
        jLabel28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel28);
        jLabel28.setBounds(80, 456, 290, 14);

        jTextArea4.setEditable(false);
        jTextArea4.setColumns(20);
        jTextArea4.setLineWrap(true);
        jTextArea4.setRows(5);
        jTextArea4.setText("Gson é uma biblioteca Java de código aberto para serializar e desserializar objetos Java para JSON.");
        jTextArea4.setWrapStyleWord(true);
        jTextArea4.setBorder(null);
        jTextArea4.setCaretPosition(0);
        jPanel2.add(jTextArea4);
        jTextArea4.setBounds(16, 475, 400, 40);

        jLabel29.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel29.setText("HttpClient:");
        jPanel2.add(jLabel29);
        jLabel29.setBounds(16, 531, 70, 14);

        jLabel30.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(51, 51, 255));
        jLabel30.setText("https://hc.apache.org/httpcomponents-client-4.5.x/");
        jLabel30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel30);
        jLabel30.setBounds(90, 531, 330, 14);

        jTextArea5.setEditable(false);
        jTextArea5.setColumns(20);
        jTextArea5.setLineWrap(true);
        jTextArea5.setRows(5);
        jTextArea5.setText("HTTPClient fornece um pacote eficiente, atualizado e rico em recursos que implementa o lado do cliente dos padrões e recomendações HTTP mais recentes.");
        jTextArea5.setWrapStyleWord(true);
        jTextArea5.setBorder(null);
        jTextArea5.setCaretPosition(0);
        jPanel2.add(jTextArea5);
        jTextArea5.setBounds(16, 550, 400, 70);

        jScrollPane2.setViewportView(jPanel2);
        jPanel2.getAccessibleContext().setAccessibleParent(jScrollPane2);

        jpLegais.add(jScrollPane2);
        jScrollPane2.setBounds(16, 16, 436, 206);

        jpMain.add(jpLegais, "cardLegais");

        getContentPane().add(jpMain);
        jpMain.setBounds(16, 100, 468, 238);

        lblClose.setBackground(new java.awt.Color(255, 255, 255));
        lblClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose.setText("Fechar");
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });
        getContentPane().add(lblClose);
        lblClose.setBounds(216, 354, 70, 30);

        getAccessibleContext().setAccessibleParent(this);

        setSize(new java.awt.Dimension(500, 400));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblEcoletaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEcoletaMouseClicked

        lblEcoleta.setBackground(Color.WHITE);
        lblCompilation.setBackground(new Color(242, 242, 242));
        lblLegais.setBackground(new Color(242, 242, 242));

        CardLayout cl = (CardLayout) jpMain.getLayout();
        cl.show(jpMain, "cardEcoleta");
    }//GEN-LAST:event_lblEcoletaMouseClicked

    private void lblCompilationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCompilationMouseClicked

        lblCompilation.setBackground(Color.WHITE);
        lblEcoleta.setBackground(new Color(242, 242, 242));
        lblLegais.setBackground(new Color(242, 242, 242));

        CardLayout cl = (CardLayout) jpMain.getLayout();
        cl.show(jpMain, "cardCompilation");
    }//GEN-LAST:event_lblCompilationMouseClicked

    private void lblLegaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLegaisMouseClicked

        lblLegais.setBackground(Color.WHITE);
        lblEcoleta.setBackground(new Color(242, 242, 242));
        lblCompilation.setBackground(new Color(242, 242, 242));

        CardLayout cl = (CardLayout) jpMain.getLayout();
        cl.show(jpMain, "cardLegais");
    }//GEN-LAST:event_lblLegaisMouseClicked

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
//        dispose();
        System.exit(0);
    }//GEN-LAST:event_lblCloseMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea11;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private br.com.loginform.components.JPanelRoundedBorder jpCompilation;
    private br.com.loginform.components.JPanelRoundedBorder jpEcoleta;
    private br.com.loginform.components.JPanelRoundedBorder jpLegais;
    private br.com.loginform.components.JPanelRoundedBorder jpMain;
    private br.com.loginform.components.JLabelRoundedBorder lblClose;
    private br.com.loginform.components.JLabelRoundedBorder lblCompilation;
    private br.com.loginform.components.JLabelRoundedBorder lblEcoleta;
    private br.com.loginform.components.JLabelRoundedBorder lblLegais;
    // End of variables declaration//GEN-END:variables
}
public class App {
    public static void limpar() {
        try {
            // Comando para limpar o terminal no Windows
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        limpar();
        System.out.printf("REGEX ");

        String data = "99/99/9999";
        String cep = "02.969-130";
        String codigo = "XF1234545";
        String nome = "João sa silva";
        String email = "izael@gmail.com";
        String logradouro = "Jd. São José";
        String website = "https://www.google.com";

        boolean regex_data = data.matches("^[0-9]{2}/[0-9]{2}/[0-9]{4}");
        boolean regex_cep = cep.matches("^[0-9]{2}\\.[0-9]{3}-[0-9]{3}");
        boolean regex_codigo = codigo.matches("^[A-Z]{2}+[0-9]{7}");
        boolean regex_nome = nome.matches("^[A-Za-zÀ-ÖØ-öø-ÿ]+(\\s[A-Za-zÀ-ÖØ-öø-ÿ]+)*");
        boolean regex_email = email.matches("^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{3,}");
        boolean regex_logradouro = logradouro.matches("^(Rua|Av\\.?|Avenida|Jd\\.?|Jardim|Travessa|Al\\.?|Alameda)? ?[A-Za-zÀ-ÖØ-öø-ÿ]+(?: [A-Za-zÀ-ÖØ-öø-ÿ]+)*");
        boolean regex_website = website.matches("^(https?://)?(www\\.)?[a-zA-Z0-9-]+(\\.[a-zA-Z]{3,})");

        System.out.printf("\n\nÉ valido DATA? %s\n\n", regex_data);
        System.out.printf("É valido CEP? %s\n\n", regex_cep);
        System.out.printf("É valido CODIGO? %s\n\n", regex_codigo);
        System.out.printf("É valido nome? %s\n\n", regex_nome);
        System.out.printf("É valido email? %s\n\n", regex_email);
        System.out.printf("É valido logradouro? %s\n\n", regex_logradouro);
        System.out.printf("É valido website? %s\n\n", regex_website);
    }
}

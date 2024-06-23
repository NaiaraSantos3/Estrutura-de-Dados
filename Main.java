package Fila;


public class Main {    
    public static void main(String[] args) {
        // minha fila de carro para lavar:
        Fila fila = add(null, "Jetta"); //inicio da minha fila
        fila = add(fila, "Gol");
        fila = add(fila, "Mercedes");
        fila = add(fila, "Volvo");
        fila = add(fila, "Ferrari");
        fila = add(fila, "Audi"); //fim da minha fila

        String lavado = "";

        lavado = remover (fila); // removendo o primeiro carro lavado (inicio da minha fila)
        System.out.println("carro lavado: " + lavado);
        
        lavado = remover (fila); // removendo o segundo carro lavado (inicio da minha fila)
        System.out.println("carro lavado: " + lavado);
        
        lavado = remover (fila); // removendo o terceiro carro lavado (inicio da minha fila)
        System.out.println("carro lavado: " + lavado);
        
        //após os três carros removidos da fila, me mostre os que ainda faltam:
        Exibir(fila.getInicio());
    }

    public static String remover (Fila fila){
        //se a minha fila tiver início e fim == null - fila vazia,
        if(fila.getInicio() == null && fila.getFim() == null){
            return null; //fila = null = vazia
        }
        //criando objeto lixo = para que o carro seja retirado da fila
        Carro lixo = fila.getFim();

        //se o início e fim da fila estão indicando para o mesmo carro, a fila ficaria nula ao retirar esse carro
        if(fila.getInicio() == fila.getFim()){ 
            fila.getInicio().setProximo(null);
            fila.getFim().setProximo(null);
            return lixo.getValor(); 
        }
        lixo = fila.getInicio();
        fila.setInicio(lixo.getProximo());
        return lixo.getValor();
    }

    //Adicionando um novo carro no final da fila
    public static Fila add(Fila fila, String v){
        Carro novo = new Carro();
        novo.setValor(v);
        novo.setProximo(null); //o carro adicionado sempre vai apontar pra null pois passa a ser o fim da fila

        //Fila nula -- tanto o inicio quanto o fim estão apontados para o mesmo carro
        if(fila == null){
            fila = new Fila();
            fila.setInicio(novo);
            fila.setFim(novo);
            return fila;
        }

        //adicionando novo carro ao final da minha fila
        fila.getFim().setProximo(novo);
        fila.setFim(novo);
        return fila;
    }    

        public static void Exibir(Carro carro){
        //se a fila de carros estiver vazia, não retorne nada
        if (carro == null){
            return;
        }
        System.out.println(carro.getValor());
        //se tiver algum carro, precisa exibir o nome do carro
        Exibir(carro.getProximo());
    }
}

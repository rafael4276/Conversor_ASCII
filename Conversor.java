public class Conversor
{
    //Código da assinatura da função
    int ascii(char x){
        if(x >= ' ' && x <= '~'){
        // código de regra de mapeamento
            return x;
        }
        //Metodo estrito
        throw new RuntimeException("Dominio invalido");
    }
}  
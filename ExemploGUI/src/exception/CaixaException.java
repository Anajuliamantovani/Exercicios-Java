package exception;

public class CaixaException extends Exception
{
    //customizar as exeções que estariam em fichas de requisitos

    private String errCode;

    public CaixaException(String errCode){
        this.errCode = errCode;
    }

    @Override
    public String getMessage()
    {
        if (errCode.equals("RF01EX01")){
            return "Valor do deposito deve ser positivo";
        }
        if (errCode.equals("RF02EX02")){
            return "Sem saldo sufiente para o saque";

        }
        return "";

    }
}

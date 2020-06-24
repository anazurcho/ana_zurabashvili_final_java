package ana.zurabashvili.cur.service;

import ana.zurabashvili.cur.model.Currency;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
@WebService
public class CurrencyService {
    List<Currency> currencies=new ArrayList<Currency>(Arrays.asList(
            new Currency("USA",1.0754,"$", new Date()),
            new Currency("UKT",2.0754,"ukt", new Date()),
            new Currency("GEL",3.0754,"lari", new Date()),
            new Currency("EUR",15.8050,"euro", new Date())
    ));


    @WebMethod
    public String GetCurrency(String currency) {
        for (Currency existingCurrency : currencies) {
            if (existingCurrency.getName().equals(currency)) {
                return String.valueOf(existingCurrency.getValue());
            }
        }
        return null;
    }

    @WebMethod
    public String GetCurrencyDescription(String currency) {
        for (Currency existingCurrency : currencies) {
            if (existingCurrency.getName().equals(currency)) {
                return String.valueOf(existingCurrency.getDescription());
            }
        }

        return "";
    }
    public String GetDate() {
        return java.time.LocalDate.now().toString();
    }

    @WebMethod
    public List<String> GetDate_1() {
        List<String> dates = new ArrayList();
        for (Currency currency : currencies) {
            dates.add(String.valueOf(currency.getDate()));
        }

        return dates;
    }
}

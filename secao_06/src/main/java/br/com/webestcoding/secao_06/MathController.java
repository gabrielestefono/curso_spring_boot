package br.com.webestcoding.secao_06;

import org.springframework.web.bind.annotation.*;

import br.com.webestcoding.exceptions.UnsupportedMathOperationException;

@RestController
public class MathController {

    @GetMapping(value = "/sum/{numberOne}/{numberTwo}")
    public double sum(@PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Por favor, use um valor numérico!");
        }
        return (convertToDouble(numberOne) + convertToDouble(numberTwo));
    }

    private Double convertToDouble(String strNumber) {
        if (strNumber == null) {
            return 0D;
        }
        String number = strNumber.replace(",", ".");
        if (isNumeric(number)) {
            return Double.parseDouble(number);
        }
        return null;
    }

    private boolean isNumeric(String strNumber) {
        if (strNumber == null) {
            return false;
        }
        String number = strNumber.replace(",", ".");
        return number.matches("[-+]?\\d*\\.?\\d+");
    }

}

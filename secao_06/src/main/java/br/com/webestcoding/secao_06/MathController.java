package br.com.webestcoding.secao_06;

import org.springframework.web.bind.annotation.*;

import br.com.webestcoding.exceptions.UnsupportedMathOperationException;

@RestController
public class MathController {
    private final String MENSAGEM = "Por favor, use um valor numérico!";

    @GetMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(@PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException(this.MENSAGEM);
        }
        return (convertToDouble(numberOne) + convertToDouble(numberTwo));
    }

    @GetMapping("/subtraction/{numberOne}/{numberTwo}")
    public Double subtraction(@PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException(this.MENSAGEM);
        }
        return (convertToDouble(numberOne) - convertToDouble(numberTwo));
    }

    @GetMapping("/division/{numberOne}/{numberTwo}")
    public Double division(@PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException(this.MENSAGEM);
        }
        return (convertToDouble(numberOne) / convertToDouble(numberTwo));
    }

    @GetMapping("/multiplication/{numberOne}/{numberTwo}")
    public Double multiplication(@PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException(this.MENSAGEM);
        }
        return (convertToDouble(numberOne) * convertToDouble(numberTwo));
    }

    @GetMapping("/sqrt/{numberOne}")
    public Double sqrt(@PathVariable("numberOne") String numberOne) throws Exception {
        if (!isNumeric(numberOne)) {
            throw new UnsupportedMathOperationException(this.MENSAGEM);
        }
        return (Math.sqrt(convertToDouble(numberOne)));
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

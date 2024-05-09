package br.com.webestcoding.secao_06;

import org.springframework.web.bind.annotation.*;

import br.com.webestcoding.converter.ConverterNumbers;
import br.com.webestcoding.converter.SimpleMath;
import br.com.webestcoding.exceptions.UnsupportedMathOperationException;

@RestController
public class MathController {
    private final String MENSAGEM = "Por favor, use um valor numérico!";

    @GetMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(@PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!ConverterNumbers.isNumeric(numberOne) || !ConverterNumbers.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException(this.MENSAGEM);
        }
        return SimpleMath
                .sum(ConverterNumbers.convertToDouble(numberOne), ConverterNumbers.convertToDouble(numberTwo));
    }

    @GetMapping("/subtraction/{numberOne}/{numberTwo}")
    public Double subtraction(@PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!ConverterNumbers.isNumeric(numberOne) || !ConverterNumbers.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException(this.MENSAGEM);
        }
        return SimpleMath
                .subtraction(ConverterNumbers.convertToDouble(numberOne), ConverterNumbers.convertToDouble(numberTwo));
    }

    @GetMapping("/division/{numberOne}/{numberTwo}")
    public Double division(@PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!ConverterNumbers.isNumeric(numberOne) || !ConverterNumbers.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException(this.MENSAGEM);
        }
        return SimpleMath
                .division(ConverterNumbers.convertToDouble(numberOne), ConverterNumbers.convertToDouble(numberTwo));
    }

    @GetMapping("/multiplication/{numberOne}/{numberTwo}")
    public Double multiplication(@PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!ConverterNumbers.isNumeric(numberOne) || !ConverterNumbers.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException(this.MENSAGEM);
        }
        return SimpleMath
                .multiplication(ConverterNumbers.convertToDouble(numberOne),
                        ConverterNumbers.convertToDouble(numberTwo));
    }

    @GetMapping("/sqrt/{numberOne}")
    public Double sqrt(@PathVariable("numberOne") String numberOne) throws Exception {
        if (!ConverterNumbers.isNumeric(numberOne)) {
            throw new UnsupportedMathOperationException(this.MENSAGEM);
        }
        return Math.sqrt(ConverterNumbers.convertToDouble(numberOne));
    }
}

package br.com.webestcoding.secao_05;

import org.springframework.web.bind.annotation.*;

@RestController
public class MathController {
    @GetMapping(value = "/sum/{numberOne}/{numberTwo}")
    public double sum(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo)
            throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new Exception();
        }
        return (convertToDouble(numberOne) + convertToDouble(numberTwo));
    }

    private boolean isNumeric(String strNumber) {
        // TODO: Criar aqui a função
        return false;
    }

    private Double convertToDouble(String strNumber) {
        // TODO: Criar aqui a função
        return null;
    }
}

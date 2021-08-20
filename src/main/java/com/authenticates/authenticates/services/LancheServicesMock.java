package com.authenticates.authenticates.services;

import com.authenticates.authenticates.vo.IngredienteVO;
import com.authenticates.authenticates.vo.LancheVO;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class LancheServicesMock {

    private static final Long ID_LANCHE = 1L;

    private static final double PRECO_BACON = 2.00;
    private static final double PRECO_HAMBURGUER_DE_CARNE = 3.00;
    private static final double PRECO_QUEIJO = 1.50;

    private static final String BACON_LABEL = "Bacon";
    private static final String HAMBURGUER_DE_CARNE_LABEL = "Hambúrguer de carne";
    private static final String QUEIJO_LABEL = "Queijo";


    public List<LancheVO> listaTodosOsLanches() {
        List<LancheVO> lancheVOS = Arrays.asList(lanche1(), lanche2());

        return lancheVOS;
    }


    public List<IngredienteVO> listaTodosOsIngredientes() {

        List<IngredienteVO> ingredientes = new ArrayList<>();

        ingredientes.add(mockBacon());
        ingredientes.add(mockHambuguerDeCarne());
        ingredientes.add(mockQueijo());

        return ingredientes;
    }


    private LancheVO lanche1() {
        final List<IngredienteVO> INGREDIENTES = mockIngredientesParaUmXBacon();
        final boolean PERSONALIZADO = false;
        final String NOME_DO_LANCHE = "X-Bacon";
        return new LancheVO(ID_LANCHE, NOME_DO_LANCHE, INGREDIENTES, PERSONALIZADO, new BigDecimal(10.00));
    }

    private LancheVO lanche2() {
        final List<IngredienteVO> INGREDIENTES = mockIngredientesParaUmXBacon();
        final boolean PERSONALIZADO = false;
        final String NOME_DO_LANCHE = "X-Teste";

        return new LancheVO(ID_LANCHE, NOME_DO_LANCHE, INGREDIENTES, PERSONALIZADO, new BigDecimal(30.00));
    }

    private List<IngredienteVO> mockIngredientesParaUmXBacon() {
        List<IngredienteVO> ingredientes = new ArrayList<>();

        ingredientes.add(mockBacon());
        ingredientes.add(mockHambuguerDeCarne());
        ingredientes.add(mockQueijo());

        return ingredientes;
    }

    private IngredienteVO mockBacon() {
        final BigDecimal PRECO = BigDecimal.valueOf(PRECO_BACON);
        return new IngredienteVO(2L, BACON_LABEL, PRECO);
    }

    private IngredienteVO mockHambuguerDeCarne() {
        final BigDecimal PRECO = BigDecimal.valueOf(PRECO_HAMBURGUER_DE_CARNE);
        return new IngredienteVO(3L, HAMBURGUER_DE_CARNE_LABEL, PRECO);
    }

    private IngredienteVO mockQueijo() {
        final BigDecimal PRECO = BigDecimal.valueOf(PRECO_QUEIJO);
        return new IngredienteVO(5L, QUEIJO_LABEL, PRECO);
    }
}

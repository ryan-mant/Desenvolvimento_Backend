package com.example.cosVeg.repository;

import com.example.cosVeg.model.Cosmetico;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public class BancoDeDados {

    List<Cosmetico> cosmeticos = new ArrayList<>();

    public BancoDeDados() {
        cosmeticos.add(new Cosmetico("Mascara Facial", 1,"Máscara facil feita com pepinos e gel especial anti-rugas" ,19.99,"https://io.convertiez.com.br/m/farmaciarosario/shop/products/images/20566/medium/mascara-facial-fenzza-green-mask-10g_42344.jpg" ));
        cosmeticos.add(new Cosmetico("Hidratante Natural", 2, "Loção com óleo de coco e extrato de romã",63.99,"https://cdn.awsli.com.br/600x700/2152/2152336/produto/211003650/lo-o-hidratante-a1f0wiavah.png"));
        cosmeticos.add(new Cosmetico("Xampu Com Carvão Ativo", 3,"Shampoo Anticaspa Com Carvão Ativado", 39.99,"https://images-americanas.b2w.io/produtos/4737814383/imagens/shampoo-anticaspa-com-carvao-ativado-cacador-abelha-rainha-250ml-ref-1386/4737814383_1_large.jpg"));
        cosmeticos.add(new Cosmetico("Loção Corporal", 4,"Loção Hidratante Corporal com Cristais Líquidos", 29.49,"https://www.videllicosmeticos.com.br/image/cache/catalog/produtos/linha-hidratacao/meleaveia-500x500.png"));
    }
    public List<Cosmetico> findAll(){
        return cosmeticos;
    }

    public String save(Cosmetico cosmetico){
        for (Cosmetico cosmetico1: cosmeticos){
            if (cosmetico.getId() == cosmetico1.getId()){
                return "cosmetico ja foi adicionado";
            }
        }cosmeticos.add(cosmetico);
        return "Cosmetico " + cosmetico.getNome() + " foi adicionado";
    }
    public String delete(int id){
        for (Cosmetico cosmetico: cosmeticos){
            if (cosmetico.getId() == id){
                cosmeticos.remove(cosmetico);
                return "Cosmetico " + cosmetico.getNome() + " foi removido com sucesso";
            }
        }
        return "Cosmetico não foi encontrado";
    }
}

package com.example.lojagamesback.repository;


import com.example.lojagamesback.model.Jogo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BancoDeDados {
    private List<Jogo> jogos = new ArrayList<>();

    public BancoDeDados(){
        jogos.add(new Jogo(1, "Resident Evil 2 Remake", "zumbi", 49.99,
                "https://www.residentevil.com/7-re2-re3/assets/images/product/title_thumb-re2-gl.jpg"));
        jogos.add(new Jogo(2, "Mortal Kombat 1", "Luta educativa", 299.99,
                "https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=500&height=500&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/05/mk1.jpg"));
        jogos.add(new Jogo(3, "God of War Ragnarok", "Garoto", 499.99,
                "https://d3alv7ekdacjys.cloudfront.net/Custom/Content/Products/11/89/1189222_jogo-ps5-god-of-war-ragnarok_m2_638006539696141504.jpg"));
        jogos.add(new Jogo(4, "Barbie the Princess and the Pauper","GOTY 2000", 999.99,
                "https://ps2media.ign.com/ps2/image/object/699/699490/barbieprincesspauper_gbabox.jpg"));
    }
    public List<Jogo> findAll(){
        return jogos;
    }
}

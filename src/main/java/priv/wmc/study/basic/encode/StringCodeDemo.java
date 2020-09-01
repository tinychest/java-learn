package priv.wmc.study.basic.encode;

import java.nio.charset.StandardCharsets;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author 王敏聪
 * @date 2020-04-27 11:23
 */
@Slf4j
public class StringCodeDemo {

    @Test
    public void demo() {
        log.info(StandardCharsets.UTF_8.name());

        String productName = "尚汤饮料-经常美（玫瑰味）";
        String iso = new String(productName.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
        String utf = new String(productName.getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8);

        log.info(iso);
        log.info(utf);
    }

}
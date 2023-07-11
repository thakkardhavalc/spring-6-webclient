package guru.springframework.spring6webclient.client;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Created By dhaval on 2023-07-11
 */
@Slf4j
@SpringBootTest
class BeerClientImplTest {

    @Autowired
    BeerClient beerClient;

    @Test
    void testListBeer() {
        beerClient.listBeer().subscribe(log::info);

        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
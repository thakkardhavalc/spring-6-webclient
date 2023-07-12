package guru.springframework.spring6webclient.client;

import reactor.core.publisher.Flux;

import java.util.Map;

/**
 * Created By dhaval on 2023-07-11
 */
public interface BeerClient {
    Flux<String> listBeer();

    Flux<Map> listBeerMap();
}

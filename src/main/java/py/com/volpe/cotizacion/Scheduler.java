package py.com.volpe.cotizacion;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author Arturo Volpe
 * @since 5/2/18
 */
@Log4j2
@Component
@Profile("production")
@RequiredArgsConstructor
public class Scheduler {

	private final GathererManager manager;

	@Scheduled(fixedDelay = 1000 * 60 * 10)
	public void reportCurrentTime() {
		log.info("Querying the services");
		manager.doQuery(null);
	}
}

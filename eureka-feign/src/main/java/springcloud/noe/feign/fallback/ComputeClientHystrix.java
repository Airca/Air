package springcloud.noe.feign.fallback;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import springcloud.noe.feign.ComputeClient;

@Component
public class ComputeClientHystrix implements ComputeClient {

    @Override
    public Integer add(@RequestParam(value = "a")Integer a, @RequestParam(value = "b") Integer b) {
        return -9999;
    }
}

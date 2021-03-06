package com.javaquickstart.configurationprofilestesting;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@AllArgsConstructor
public class TechnologyNewsController {

  private final TechnologyNewsOperation technologyNewsOperation;

  @GetMapping("headlines")
  public List<String> getNews() {
    return technologyNewsOperation.getTechnologyHeadlines();
  }

}

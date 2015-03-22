package com.jas

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(DownloaderController)
class DownloaderControllerSpec extends Specification {

  void "should say hello"() {
    when:
    controller.hello()

    then:
    response.text == 'hello'
  }
}

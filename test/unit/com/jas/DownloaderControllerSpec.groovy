package com.jas

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(DownloaderController)
class DownloaderControllerSpec extends Specification {
  DownloaderService downloaderService = Mock(DownloaderService)
  String address = "127.0.0.1"

  def setup() {
     controller.downloaderService = downloaderService
  }

  void "should download Ubuntu"() {
    when:
    controller.downloadUbuntuVersion()

    then:
    1 * downloaderService.createUbuntuStat(address)
    response.text == address
  }
}

package com.jas

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(DownloaderService)
@Mock(Downloader)
class DownloaderServiceSpec extends Specification {

    void "should create a ubuntu download stat"() {
      when:
      def downloader = service.createUbuntuStat('127.0.0.1')
      then:
      downloader.address == '127.0.0.1'
      downloader.type == InstallerType.UBUNTU
    }
}

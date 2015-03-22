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
  
  void "should create a ubuntu mac stat"() {
    when:
    def downloader = service.createMacStat('127.0.0.1')
    then:
    downloader.address == '127.0.0.1'
    downloader.type == InstallerType.MAC
  }
  
  void "should create a ubuntu windows stat"() {
    when:
    def downloader = service.createWindowsStat('127.0.0.1')
    then:
    downloader.address == '127.0.0.1'
    downloader.type == InstallerType.WINDOWS
  }

  void "should create a ubuntu linux stat"() {
    when:
    def downloader = service.createLinuxStat('127.0.0.1')
    then:
    downloader.address == '127.0.0.1'
    downloader.type == InstallerType.LINUX
  }
}

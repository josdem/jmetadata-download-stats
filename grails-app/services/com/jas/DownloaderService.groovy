package com.jas

import grails.transaction.Transactional

@Transactional
class DownloaderService {

  def Downloader createUbuntuStat(String address){
    def downloader = new Downloader()
    downloader.address = address
    downloader.type = InstallerType.UBUNTU
    downloader.save()
    return downloader
  }

  def Downloader createMacStat(String address){
    def downloader = new Downloader()
    downloader.address = address
    downloader.type = InstallerType.MAC
    downloader.save()
    return downloader
  }
}

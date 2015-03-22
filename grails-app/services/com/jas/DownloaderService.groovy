package com.jas

import grails.transaction.Transactional

@Transactional
class DownloaderService {

  def Downloader createUbuntuStat(String address){
    return saveDownloader(address, InstallerType.UBUNTU)
  }

  def Downloader createMacStat(String address){
    return saveDownloader(address, InstallerType.MAC)
  }

  def Downloader createWindowsStat(String address){
     return saveDownloader(address, InstallerType.WINDOWS)
  }

  def Downloader saveDownloader(String address, InstallerType type){
    def downloader = new Downloader()
    downloader.address = address
    downloader.type = type
    downloader.save()
    return downloader
  }

}

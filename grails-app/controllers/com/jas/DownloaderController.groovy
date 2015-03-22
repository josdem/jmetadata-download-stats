package com.jas

class DownloaderController {

  def downloaderService

  def downloadUbuntuVersion(){
    log.info "Registring Ubuntu stat from: " + request.getRemoteAddr()
    downloaderService.createUbuntuStat(request.getRemoteAddr())
    render request.getRemoteAddr()
  }

  def downloadMacVersion() {
    log.info "Registring Mac stat from: " + request.getRemoteAddr()
    downloaderService.createMacStat(request.getRemoteAddr())
    render request.getRemoteAddr()
  }

  def downloadWindowsVersion() {
    log.info "Registring Windows stat from: " + request.getRemoteAddr()
    downloaderService.createWindowsStat(request.getRemoteAddr())
    render request.getRemoteAddr()
  }

}

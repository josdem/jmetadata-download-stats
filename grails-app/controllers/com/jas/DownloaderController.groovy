package com.jas

class DownloaderController {

  def downloaderService

  def downloadUbuntuVersion(){
    log.info "Registring ubuntu stat from: " + request.getRemoteAddr()
    downloaderService.createUbuntuStat(request.getRemoteAddr())
    render request.getRemoteAddr()
  }

}

package com.jas

class DownloaderController {

  def downloaderService

  def downloadUbuntuVersion(){
    log.info "Registring ubuntu stat from: " + request.getRemoteAddr()
    downloaderService.createUbuntuStat(request.getRemoteAddr())
    render request.getRemoteAddr()
  }

  def downloadMacVersion() {
   log.info "Registring mac stat from: " + request.getRemoteAddr()
   downloaderService.createMacStat(request.getRemoteAddr())
   render request.getRemoteAddr()
  }

}

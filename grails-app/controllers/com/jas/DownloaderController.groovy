package com.jas

class DownloaderController {

  def downloadUbuntuVersion(){
    log.info "Getting request from: " + request.getRemoteAddr()
    render request.getRemoteAddr()
  }

}

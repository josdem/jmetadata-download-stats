package com.jas

class DownloaderController {

  def downloadUbuntuVersion(){
    log.info "Getting request from: " + request.getRemoteAddr()
    def downloader = new Downloader()
    downloader.address = request.getRemoteAddr()
    downloader.type = InstallerType.UBUNTU
    downloader.save()
    render "ubuntu"
  }

}

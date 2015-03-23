package com.jas

class DownloaderController {

  def downloaderService

  def downloadUbuntuVersion(){
    log.info "Registring Ubuntu stat from: " + request.getRemoteAddr()
    downloaderService.createUbuntuStat(request.getRemoteAddr())

    def file = new File("/home/josdem/.jmetadata/JMetadata.deb")    
    response.setContentType("application/octet-stream")
    response.setHeader("Content-disposition", "attachment;filename=${file.getName()}")

    response.outputStream << file.newInputStream()
  }

  def downloadMacVersion() {
    log.info "Registring Mac stat from: " + request.getRemoteAddr()
    downloaderService.createMacStat(request.getRemoteAddr())

    def file = new File("/home/josdem/.jmetadata/JMetadata.dmg")    
    response.setContentType("application/octet-stream")
    response.setHeader("Content-disposition", "attachment;filename=${file.getName()}")

    response.outputStream << file.newInputStream()
  }

  def downloadWindowsVersion() {
    log.info "Registring Windows stat from: " + request.getRemoteAddr()
    downloaderService.createWindowsStat(request.getRemoteAddr())
    render request.getRemoteAddr()
  }

  def downloadLinuxVersion() {
    log.info "Registring Linux stat from: " + request.getRemoteAddr()
    downloaderService.createLinuxStat(request.getRemoteAddr())
    render request.getRemoteAddr()
  }


}

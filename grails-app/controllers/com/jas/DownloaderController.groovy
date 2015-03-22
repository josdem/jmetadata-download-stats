package com.jas

class DownloaderController {

  def downloaderService

  def downloadUbuntuVersion(){
    log.info "Registring Ubuntu stat from: " + request.getRemoteAddr()
    downloaderService.createUbuntuStat(request.getRemoteAddr())
    def file = new File("file.pdf")    
    log.info "path file: " + file.getAbsolutePath()
    response.setContentType("application/octet-stream")
    response.setHeader("Content-disposition", "attachment;filename=${file.getName()}")

    response.outputStream << file.newInputStream()
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

  def downloadLinuxVersion() {
    log.info "Registring Linux stat from: " + request.getRemoteAddr()
    downloaderService.createLinuxStat(request.getRemoteAddr())
    render request.getRemoteAddr()
  }


}

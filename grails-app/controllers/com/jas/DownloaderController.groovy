package com.jas

class DownloaderController {

  def downloaderService

  def index(){
    render "ok"
  }

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
    
    def file = new File("/home/josdem/.jmetadata/JMetadata.exe")    
    response.setContentType("application/octet-stream")
    response.setHeader("Content-disposition", "attachment;filename=${file.getName()}")

    response.outputStream << file.newInputStream()
  }

  def downloadLinuxVersion() {
    log.info "Registring Linux stat from: " + request.getRemoteAddr()
    downloaderService.createLinuxStat(request.getRemoteAddr())
    
    def file = new File("/home/josdem/.jmetadata/JMetadata-Linux.zip")    
    response.setContentType("application/octet-stream")
    response.setHeader("Content-disposition", "attachment;filename=${file.getName()}")

    response.outputStream << file.newInputStream()
  }


}

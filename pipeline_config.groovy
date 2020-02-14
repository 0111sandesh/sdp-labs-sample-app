libraries{
  sdp{
    images{
      registry = "http://0.0.0.0:5000" // registry url
      cred = "sdp-docker-registry"// jenkins cred id to authenticate
      docker_args = "--network=try-it-out_sdp"  // docker runtime args
    }
  }
  github_enterprise
  deploy
  gradle
  sonarqube{
    enforce_quality_gate = true
  }
  docker{
    registry = "0.0.0.0:5000"
    cred = "sdp-docker-registry"
  }
  owasp_zap{
    target = "http://10.0.1.161:80"
    vulnerability_threshold = "Ignore"
  }

}

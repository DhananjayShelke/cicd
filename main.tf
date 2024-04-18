
terraform {
  required_providers {
    google = {
      source  = "hashicorp/google"
      version = "4.51.0"
    }
  }
  backend "local" {

  }
}

provider "google" {
  project = "cicd-420214"
  region = "asia-south1"
}

resource "google_cloud_run_service" "first_service" {
  location = "asia-south1"
  name     = "ci-cd"
  template {
    spec {
      containers {
        image = "asia-south1-docker.pkg.dev/cicd-420214/cicd/artifact-registry/cicd"
      }

    }
  }
  traffic {
    percent         = 100
    latest_revision = true
  }
}
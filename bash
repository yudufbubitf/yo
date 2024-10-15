# Install the required packages
npm install -g ultraviolet-proxy

# Create a configuration file
echo '{
  "proxy": {
    "type": "http",
    "host": "your.proxy.host",
    "port": 8080,
    "username": "your_username",
    "password": "your_password"
  }
}' > config.json

# Start the ultraviolet proxy
ultraviolet-proxy --config config.json

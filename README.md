# ArtX Backend

## Services

- Metadata hosting
  - Upload
- Order tracking
  - Make swap
  - Close swap
  - Take swap

The backend does not host images, which can be instead stored on

- IPFS
- Amazon S3

## Security

The _state-changing_ APIs (e.g., upload and swap) requires authentication. The authenticated user must be the one conducting the Ethereum transaction. This can be achieved via _Sign In With Ethereum_ workflow.

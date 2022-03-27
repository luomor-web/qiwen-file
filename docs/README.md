```shell
find . -name "docker-compose.yml"|xargs -I {} grep -r 'elasticsearch' {}
```

```
roncoo-education
jetlinks-community
cskefu
```
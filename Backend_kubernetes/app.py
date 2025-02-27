from fastapi import FastAPI

app = FastAPI()

@app.get("/")
def read_root():
    return {"message": "Hello from FastAPI v2"}

@app.get("/status")
def read_status():
    return {"status": "running"}
